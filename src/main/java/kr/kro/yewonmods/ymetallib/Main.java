package kr.kro.yewonmods.ymetallib;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
	
	public static final ItemGroup YMETALLIBGROUP = FabricItemGroupBuilder.build(
			new Identifier("ymetallib", "ymetallib_group"),
			() -> new ItemStack(Items.IRON_INGOT));
	
	//Blocks
	public static final Block TIN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(6.9999F));
	public static final Block BRONZE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(7.9999F));
	public static final Block LEAD_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(0.9999F));
	public static final Block SILVER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(1.9999F));
	public static final Block PLATINUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(9.9999F));
	public static final Block NICKEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(3.9999F));
	public static final Block INVAR_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(3.9999F));
	public static final Block ELECTRUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.9999F));
	public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(8.9999F));
	public static final Block ALUMINUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.9999F));
	
	//Ingots
	public static final Item TIN_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item LEAD_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item BRONZE_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item SILVER_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item PLATINUM_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item NICKEL_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item INVAR_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ELECTRUM_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item STEEL_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ALUMINUM_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	
	//Mixtures
	public static final Item BRONZE_MIXTURE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item INVAR_MIXTURE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ELECTRUM_MIXTURE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item STEEL_MIXTURE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ALUMINUM_MIXTURE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	
	//Dusts
	public static final Item COPPER_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item TIN_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item LEAD_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item BRONZE_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item SILVER_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item PLATINUM_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item NICKEL_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item INVAR_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ELECTRUM_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item STEEL_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ALUMINUM_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ENDERIUM_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item IRON_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item GOLD_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item CARBON_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	
	//Nuggets
	public static final Item TIN_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item LEAD_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item BRONZE_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item SILVER_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item PLATINUM_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item NICKEL_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item INVAR_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ELECTRUM_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item STEEL_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ALUMINUM_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	
	//Plates
	public static final Item BRONZE_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item STEEL_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item COPPER_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item TIN_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item LEAD_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item SILVER_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item PLATINUM_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item NICKEL_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item INVAR_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ELECTRUM_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ALUMINUM_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item IRON_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item GOLD_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	
	//Ores
	public static final Block TIN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(6.9999F));
	public static final Block LEAD_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(0.9999F));
	public static final Block SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.9999F));
	public static final Block PLATINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(9.9999F));
	public static final Block NICKEL_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.9999F));
	public static final Block ALUMINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(9.9999F));

	@Override
	public void onInitialize() {
		
		//Blocks
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "tin_block"), TIN_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "bronze_block"), BRONZE_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "lead_block"), LEAD_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "silver_block"), SILVER_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "platinum_block"), PLATINUM_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "nickel_block"), NICKEL_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "invar_block"), INVAR_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "electrum_block"), ELECTRUM_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "steel_block"), STEEL_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "aluminum_block"), ALUMINUM_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tin_block"), new BlockItem(TIN_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "bronze_block"), new BlockItem(BRONZE_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "lead_block"), new BlockItem(LEAD_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "silver_block"), new BlockItem(SILVER_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "platinum_block"), new BlockItem(PLATINUM_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nickel_block"), new BlockItem(NICKEL_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "invar_block"), new BlockItem(INVAR_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "electrum_block"), new BlockItem(ELECTRUM_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "steel_block"), new BlockItem(STEEL_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "aluminum_block"), new BlockItem(ALUMINUM_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		
		//Ingots
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tin_ingot"), TIN_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "bronze_ingot"), BRONZE_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "lead_ingot"), LEAD_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "silver_ingot"), SILVER_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "platinum_ingot"), PLATINUM_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nickel_ingot"), NICKEL_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "invar_ingot"), INVAR_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "electrum_ingot"), ELECTRUM_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "steel_ingot"), STEEL_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "aluminum_ingot"), ALUMINUM_INGOT);
		
		//Nuggets
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tin_nugget"), TIN_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "bronze_nugget"), BRONZE_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "lead_nugget"), LEAD_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "silver_nugget"), SILVER_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "platinum_nugget"), PLATINUM_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nickel_nugget"), NICKEL_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "invar_nugget"), INVAR_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "electrum_nugget"), ELECTRUM_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "steel_nugget"), STEEL_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "aluminum_nugget"), ALUMINUM_NUGGET);
		
		//Mixtures
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "bronze_mixture"), BRONZE_MIXTURE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "invar_mixture"), INVAR_MIXTURE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "electrum_mixture"), ELECTRUM_MIXTURE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "steel_mixture"), STEEL_MIXTURE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "aluminum_mixture"), ALUMINUM_MIXTURE);
		
		//Dusts
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "copper_dust"), COPPER_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tin_dust"), TIN_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "bronze_dust"), BRONZE_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "lead_dust"), LEAD_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "silver_dust"), SILVER_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "platinum_dust"), PLATINUM_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nickel_dust"), NICKEL_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "invar_dust"), INVAR_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "electrum_dust"), ELECTRUM_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "steel_dust"), STEEL_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "aluminum_dust"), ALUMINUM_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "iron_dust"), IRON_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "gold_dust"), GOLD_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "carbon_dust"), CARBON_DUST);
		
		//Plates
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "bronze_plate"), BRONZE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "steel_plate"), STEEL_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "copper_plate"), COPPER_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tin_plate"), TIN_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "lead_plate"), LEAD_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "silver_plate"), SILVER_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "platinum_plate"), PLATINUM_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nickel_plate"), NICKEL_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "invar_plate"), INVAR_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "electrum_plate"), ELECTRUM_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "aluminum_plate"), ALUMINUM_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "iron_plate"), IRON_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "gold_plate"), GOLD_PLATE);
		
		
		//Ores
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "tin_ore"), TIN_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "lead_ore"), LEAD_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "silver_ore"), SILVER_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "platinum_ore"), PLATINUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "nickel_ore"), NICKEL_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "aluminum_ore"), ALUMINUM_ORE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tin_ore"), new BlockItem(TIN_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "lead_ore"), new BlockItem(LEAD_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "silver_ore"), new BlockItem(SILVER_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "platinum_ore"), new BlockItem(PLATINUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nickel_ore"), new BlockItem(NICKEL_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "aluminum_ore"), new BlockItem(ALUMINUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
	}

}
