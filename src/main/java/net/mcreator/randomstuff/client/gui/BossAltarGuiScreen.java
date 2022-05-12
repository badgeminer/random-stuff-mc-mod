
package net.mcreator.randomstuff.client.gui;

public class BossAltarGuiScreen extends AbstractContainerScreen<BossAltarGuiMenu> {

	private final static HashMap<String, Object> guistate = BossAltarGuiMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BossAltarGuiScreen(BossAltarGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("random_stuff:textures/boss_altar_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);

	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("random_stuff:textures/marker_towersavepoint.png"));
		this.blit(ms, this.leftPos + 69, this.topPos + 7, 0, 0, 33, 30, 33, 30);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "summon bosses", -74, 7, -1);
		this.font.draw(poseStack, "use soul shards and a", -110, 16, -1);
		this.font.draw(poseStack, "summoning item to spawn", -119, 25, -1);
		this.font.draw(poseStack, "bosses", -38, 34, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();

		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);

		this.addRenderableWidget(new Button(this.leftPos + 60, this.topPos + 43, 51, 20, new TextComponent("SPAWN"), e -> {
			if (true) {
				RandomStuffMod.PACKET_HANDLER.sendToServer(new BossAltarGuiButtonMessage(0, x, y, z));
				BossAltarGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}

}
