package net.mcreator.something.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.something.world.inventory.JakyFurnaceGUIMenu;
import net.mcreator.something.procedures.JakyFuelProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class JakyFurnaceGUIScreen extends AbstractContainerScreen<JakyFurnaceGUIMenu> {
	private final static HashMap<String, Object> guistate = JakyFurnaceGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public JakyFurnaceGUIScreen(JakyFurnaceGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("something:textures/screens/jaky_furnace_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.something.jaky_furnace_gui.label_avada_kedavra"), 9, 9, -16777216, false);
		guiGraphics.drawString(this.font,

				JakyFuelProcedure.execute(world, x, y, z), 119, 9, -13369396, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
