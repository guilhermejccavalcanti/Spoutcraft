package com.prupe.mcpatcher;

import java.util.Comparator;
import net.minecraft.src.ResourceLocation;

final class TexturePackAPI$2 implements Comparator<ResourceLocation> {
	public int compare(ResourceLocation o1, ResourceLocation o2) {
		return o1.getResourcePath().compareTo(o2.getResourcePath());
	}	
}
