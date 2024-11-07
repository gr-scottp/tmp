package net.mcreator.oogaboogablockgen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.oogaboogablockgen.world.inventory.YIPEEMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class YIPEEScreen extends AbstractContainerScreen<YIPEEMenu> {
	private final static HashMap<String, Object> guistate = YIPEEMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public YIPEEScreen(YIPEEMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("oogaboogablockgen:textures/screens/yipee.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.oogaboogablockgen.yipee.label_you_just_got_fanum_taxed"), 25, 3, -13950157, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.oogaboogablockgen.yipee.label_insert_money_to_pay_your_fanum_t"), 6, 73, -11978669, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
