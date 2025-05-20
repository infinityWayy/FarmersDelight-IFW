package vectorwing.farmersdelight.common.registry;

import com.google.common.collect.Sets;
import huix.infinity.common.core.component.IFWDataComponents;
import huix.infinity.common.world.food.IFWFoodProperties;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.item.*;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.Supplier;

@SuppressWarnings("unused")
public class ModItems
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, FarmersDelight.MODID);
	public static LinkedHashSet<Supplier<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

	public static Supplier<Item> registerWithTab(final String name, final Supplier<Item> supplier) {
		Supplier<Item> block = ITEMS.register(name, supplier);
		CREATIVE_TAB_ITEMS.add(block);
		return block;
	}

	// Helper methods
	public static Item.Properties basicItem() {
		return new Item.Properties();
	}

	public static Item.Properties knifeItem(Tier tier) {
		return new Item.Properties().attributes(KnifeItem.createAttributes(tier, 0.5F, -2.0F));
	}

	public static Item.Properties foodItem(FoodProperties food) {
		return new Item.Properties().food(food);
	}

	public static Item.Properties bowlFoodItem(FoodProperties food) {
		return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16);
	}

	public static Item.Properties drinkItem() {
		return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
	}

	// Blocks
	public static final Supplier<Item> STOVE = registerWithTab("stove",
			() -> new BlockItem(ModBlocks.STOVE.get(), basicItem()));
	public static final Supplier<Item> COOKING_POT = registerWithTab("cooking_pot",
			() -> new CookingPotItem(ModBlocks.COOKING_POT.get(), basicItem().stacksTo(1)));
	public static final Supplier<Item> SKILLET = registerWithTab("skillet",
			() -> new SkilletItem(ModBlocks.SKILLET.get(), basicItem().stacksTo(1).attributes(SkilletItem.createAttributes(SkilletItem.SKILLET_TIER, 5.0F, -3.1F))));
	public static final Supplier<Item> CUTTING_BOARD = registerWithTab("cutting_board",
			() -> new FuelBlockItem(ModBlocks.CUTTING_BOARD.get(), basicItem(), 200));
	public static final Supplier<Item> BASKET = registerWithTab("basket",
			() -> new FuelBlockItem(ModBlocks.BASKET.get(), basicItem(), 300));

	public static final Supplier<Item> CARROT_CRATE = registerWithTab("carrot_crate",
			() -> new BlockItem(ModBlocks.CARROT_CRATE.get(), basicItem()));
	public static final Supplier<Item> POTATO_CRATE = registerWithTab("potato_crate",
			() -> new BlockItem(ModBlocks.POTATO_CRATE.get(), basicItem()));
	public static final Supplier<Item> BEETROOT_CRATE = registerWithTab("beetroot_crate",
			() -> new BlockItem(ModBlocks.BEETROOT_CRATE.get(), basicItem()));
	public static final Supplier<Item> CABBAGE_CRATE = registerWithTab("cabbage_crate",
			() -> new BlockItem(ModBlocks.CABBAGE_CRATE.get(), basicItem()));
	public static final Supplier<Item> TOMATO_CRATE = registerWithTab("tomato_crate",
			() -> new BlockItem(ModBlocks.TOMATO_CRATE.get(), basicItem()));
	public static final Supplier<Item> ONION_CRATE = registerWithTab("onion_crate",
			() -> new BlockItem(ModBlocks.ONION_CRATE.get(), basicItem()));
	public static final Supplier<Item> RICE_BALE = registerWithTab("rice_bale",
			() -> new BlockItem(ModBlocks.RICE_BALE.get(), basicItem()));
	public static final Supplier<Item> RICE_BAG = registerWithTab("rice_bag",
			() -> new BlockItem(ModBlocks.RICE_BAG.get(), basicItem()));
	public static final Supplier<Item> STRAW_BALE = registerWithTab("straw_bale",
			() -> new BlockItem(ModBlocks.STRAW_BALE.get(), basicItem()));

	public static final Supplier<Item> SAFETY_NET = registerWithTab("safety_net",
			() -> new FuelBlockItem(ModBlocks.SAFETY_NET.get(), basicItem(), 200));
	public static final Supplier<Item> OAK_CABINET = registerWithTab("oak_cabinet",
			() -> new FuelBlockItem(ModBlocks.OAK_CABINET.get(), basicItem(), 300));
	public static final Supplier<Item> SPRUCE_CABINET = registerWithTab("spruce_cabinet",
			() -> new FuelBlockItem(ModBlocks.SPRUCE_CABINET.get(), basicItem(), 300));
	public static final Supplier<Item> BIRCH_CABINET = registerWithTab("birch_cabinet",
			() -> new FuelBlockItem(ModBlocks.BIRCH_CABINET.get(), basicItem(), 300));
	public static final Supplier<Item> JUNGLE_CABINET = registerWithTab("jungle_cabinet",
			() -> new FuelBlockItem(ModBlocks.JUNGLE_CABINET.get(), basicItem(), 300));
	public static final Supplier<Item> ACACIA_CABINET = registerWithTab("acacia_cabinet",
			() -> new FuelBlockItem(ModBlocks.ACACIA_CABINET.get(), basicItem(), 300));
	public static final Supplier<Item> DARK_OAK_CABINET = registerWithTab("dark_oak_cabinet",
			() -> new FuelBlockItem(ModBlocks.DARK_OAK_CABINET.get(), basicItem(), 300));
	public static final Supplier<Item> MANGROVE_CABINET = registerWithTab("mangrove_cabinet",
			() -> new FuelBlockItem(ModBlocks.MANGROVE_CABINET.get(), basicItem(), 300));
	public static final Supplier<Item> CHERRY_CABINET = registerWithTab("cherry_cabinet",
			() -> new FuelBlockItem(ModBlocks.CHERRY_CABINET.get(), basicItem(), 300));
	public static final Supplier<Item> BAMBOO_CABINET = registerWithTab("bamboo_cabinet",
			() -> new FuelBlockItem(ModBlocks.BAMBOO_CABINET.get(), basicItem(), 300));
	public static final Supplier<Item> CRIMSON_CABINET = registerWithTab("crimson_cabinet",
			() -> new BlockItem(ModBlocks.CRIMSON_CABINET.get(), basicItem()));
	public static final Supplier<Item> WARPED_CABINET = registerWithTab("warped_cabinet",
			() -> new BlockItem(ModBlocks.WARPED_CABINET.get(), basicItem()));
	public static final Supplier<Item> TATAMI = registerWithTab("tatami",
			() -> new FuelBlockItem(ModBlocks.TATAMI.get(), basicItem(), 400));
	public static final Supplier<Item> FULL_TATAMI_MAT = registerWithTab("full_tatami_mat",
			() -> new FuelBlockItem(ModBlocks.FULL_TATAMI_MAT.get(), basicItem(), 200));
	public static final Supplier<Item> HALF_TATAMI_MAT = registerWithTab("half_tatami_mat",
			() -> new FuelBlockItem(ModBlocks.HALF_TATAMI_MAT.get(), basicItem()));
	public static final Supplier<Item> CANVAS_RUG = registerWithTab("canvas_rug",
			() -> new FuelBlockItem(ModBlocks.CANVAS_RUG.get(), basicItem(), 200));
	public static final Supplier<Item> ORGANIC_COMPOST = registerWithTab("organic_compost",
			() -> new BlockItem(ModBlocks.ORGANIC_COMPOST.get(), basicItem()));
	public static final Supplier<Item> RICH_SOIL = registerWithTab("rich_soil",
			() -> new BlockItem(ModBlocks.RICH_SOIL.get(), basicItem()));
	public static final Supplier<Item> RICH_SOIL_FARMLAND = registerWithTab("rich_soil_farmland",
			() -> new BlockItem(ModBlocks.RICH_SOIL_FARMLAND.get(), basicItem()));
	public static final Supplier<Item> ROPE = registerWithTab("rope",
			() -> new RopeItem(ModBlocks.ROPE.get(), basicItem()));

	// Canvas Signs...
	public static final Supplier<Item> CANVAS_SIGN = registerWithTab("canvas_sign",
			() -> new SignItem(basicItem(), ModBlocks.CANVAS_SIGN.get(), ModBlocks.CANVAS_WALL_SIGN.get()));
	public static final Supplier<Item> HANGING_CANVAS_SIGN = registerWithTab("hanging_canvas_sign",
			() -> new HangingSignItem(ModBlocks.HANGING_CANVAS_SIGN.get(), ModBlocks.HANGING_CANVAS_WALL_SIGN.get(), basicItem()));

	public static final Supplier<Item> WHITE_CANVAS_SIGN = registerWithTab("white_canvas_sign",
			() -> new SignItem(basicItem(), ModBlocks.WHITE_CANVAS_SIGN.get(), ModBlocks.WHITE_CANVAS_WALL_SIGN.get()));
	public static final Supplier<Item> WHITE_HANGING_CANVAS_SIGN = registerWithTab("white_hanging_canvas_sign",
			() -> new HangingSignItem(ModBlocks.WHITE_HANGING_CANVAS_SIGN.get(), ModBlocks.WHITE_HANGING_CANVAS_WALL_SIGN.get(), basicItem()));

	public static final Supplier<Item> LIGHT_GRAY_CANVAS_SIGN = registerWithTab("light_gray_canvas_sign",
			() -> new SignItem(basicItem(), ModBlocks.LIGHT_GRAY_CANVAS_SIGN.get(), ModBlocks.LIGHT_GRAY_CANVAS_WALL_SIGN.get()));
	public static final Supplier<Item> LIGHT_GRAY_HANGING_CANVAS_SIGN = registerWithTab("light_gray_hanging_canvas_sign",
			() -> new HangingSignItem(ModBlocks.LIGHT_GRAY_HANGING_CANVAS_SIGN.get(), ModBlocks.LIGHT_GRAY_HANGING_CANVAS_WALL_SIGN.get(), basicItem()));

	public static final Supplier<Item> GRAY_CANVAS_SIGN = registerWithTab("gray_canvas_sign",
			() -> new SignItem(basicItem(), ModBlocks.GRAY_CANVAS_SIGN.get(), ModBlocks.GRAY_CANVAS_WALL_SIGN.get()));
	public static final Supplier<Item> GRAY_HANGING_CANVAS_SIGN = registerWithTab("gray_hanging_canvas_sign",
			() -> new HangingSignItem(ModBlocks.GRAY_HANGING_CANVAS_SIGN.get(), ModBlocks.GRAY_HANGING_CANVAS_WALL_SIGN.get(), basicItem()));

	public static final Supplier<Item> BLACK_CANVAS_SIGN = registerWithTab("black_canvas_sign",
			() -> new SignItem(basicItem(), ModBlocks.BLACK_CANVAS_SIGN.get(), ModBlocks.BLACK_CANVAS_WALL_SIGN.get()));
	public static final Supplier<Item> BLACK_HANGING_CANVAS_SIGN = registerWithTab("black_hanging_canvas_sign",
			() -> new HangingSignItem(ModBlocks.BLACK_HANGING_CANVAS_SIGN.get(), ModBlocks.BLACK_HANGING_CANVAS_WALL_SIGN.get(), basicItem()));

	public static final Supplier<Item> BROWN_CANVAS_SIGN = registerWithTab("brown_canvas_sign",
			() -> new SignItem(basicItem(), ModBlocks.BROWN_CANVAS_SIGN.get(), ModBlocks.BROWN_CANVAS_WALL_SIGN.get()));
	public static final Supplier<Item> BROWN_HANGING_CANVAS_SIGN = registerWithTab("brown_hanging_canvas_sign",
			() -> new HangingSignItem(ModBlocks.BROWN_HANGING_CANVAS_SIGN.get(), ModBlocks.BROWN_HANGING_CANVAS_WALL_SIGN.get(), basicItem()));

	public static final Supplier<Item> RED_CANVAS_SIGN = registerWithTab("red_canvas_sign",
			() -> new SignItem(basicItem(), ModBlocks.RED_CANVAS_SIGN.get(), ModBlocks.RED_CANVAS_WALL_SIGN.get()));
	public static final Supplier<Item> RED_HANGING_CANVAS_SIGN = registerWithTab("red_hanging_canvas_sign",
			() -> new HangingSignItem(ModBlocks.RED_HANGING_CANVAS_SIGN.get(), ModBlocks.RED_HANGING_CANVAS_WALL_SIGN.get(), basicItem()));

	public static final Supplier<Item> ORANGE_CANVAS_SIGN = registerWithTab("orange_canvas_sign",
			() -> new SignItem(basicItem(), ModBlocks.ORANGE_CANVAS_SIGN.get(), ModBlocks.ORANGE_CANVAS_WALL_SIGN.get()));
	public static final Supplier<Item> ORANGE_HANGING_CANVAS_SIGN = registerWithTab("orange_hanging_canvas_sign",
			() -> new HangingSignItem(ModBlocks.ORANGE_HANGING_CANVAS_SIGN.get(), ModBlocks.ORANGE_HANGING_CANVAS_WALL_SIGN.get(), basicItem()));

	public static final Supplier<Item> YELLOW_CANVAS_SIGN = registerWithTab("yellow_canvas_sign",
			() -> new SignItem(basicItem(), ModBlocks.YELLOW_CANVAS_SIGN.get(), ModBlocks.YELLOW_CANVAS_WALL_SIGN.get()));
	public static final Supplier<Item> YELLOW_HANGING_CANVAS_SIGN = registerWithTab("yellow_hanging_canvas_sign",
			() -> new HangingSignItem(ModBlocks.YELLOW_HANGING_CANVAS_SIGN.get(), ModBlocks.YELLOW_HANGING_CANVAS_WALL_SIGN.get(), basicItem()));

	public static final Supplier<Item> LIME_CANVAS_SIGN = registerWithTab("lime_canvas_sign",
			() -> new SignItem(basicItem(), ModBlocks.LIME_CANVAS_SIGN.get(), ModBlocks.LIME_CANVAS_WALL_SIGN.get()));
	public static final Supplier<Item> LIME_HANGING_CANVAS_SIGN = registerWithTab("lime_hanging_canvas_sign",
			() -> new HangingSignItem(ModBlocks.LIME_HANGING_CANVAS_SIGN.get(), ModBlocks.LIME_HANGING_CANVAS_WALL_SIGN.get(), basicItem()));

	public static final Supplier<Item> GREEN_CANVAS_SIGN = registerWithTab("green_canvas_sign",
			() -> new SignItem(basicItem(), ModBlocks.GREEN_CANVAS_SIGN.get(), ModBlocks.GREEN_CANVAS_WALL_SIGN.get()));
	public static final Supplier<Item> GREEN_HANGING_CANVAS_SIGN = registerWithTab("green_hanging_canvas_sign",
			() -> new HangingSignItem(ModBlocks.GREEN_HANGING_CANVAS_SIGN.get(), ModBlocks.GREEN_HANGING_CANVAS_WALL_SIGN.get(), basicItem()));

	public static final Supplier<Item> CYAN_CANVAS_SIGN = registerWithTab("cyan_canvas_sign",
			() -> new SignItem(basicItem(), ModBlocks.CYAN_CANVAS_SIGN.get(), ModBlocks.CYAN_CANVAS_WALL_SIGN.get()));
	public static final Supplier<Item> CYAN_HANGING_CANVAS_SIGN = registerWithTab("cyan_hanging_canvas_sign",
			() -> new HangingSignItem(ModBlocks.CYAN_HANGING_CANVAS_SIGN.get(), ModBlocks.CYAN_HANGING_CANVAS_WALL_SIGN.get(), basicItem()));

	public static final Supplier<Item> LIGHT_BLUE_CANVAS_SIGN = registerWithTab("light_blue_canvas_sign",
			() -> new SignItem(basicItem(), ModBlocks.LIGHT_BLUE_CANVAS_SIGN.get(), ModBlocks.LIGHT_BLUE_CANVAS_WALL_SIGN.get()));
	public static final Supplier<Item> LIGHT_BLUE_HANGING_CANVAS_SIGN = registerWithTab("light_blue_hanging_canvas_sign",
			() -> new HangingSignItem(ModBlocks.LIGHT_BLUE_HANGING_CANVAS_SIGN.get(), ModBlocks.LIGHT_BLUE_HANGING_CANVAS_WALL_SIGN.get(), basicItem()));

	public static final Supplier<Item> BLUE_CANVAS_SIGN = registerWithTab("blue_canvas_sign",
			() -> new SignItem(basicItem(), ModBlocks.BLUE_CANVAS_SIGN.get(), ModBlocks.BLUE_CANVAS_WALL_SIGN.get()));
	public static final Supplier<Item> BLUE_HANGING_CANVAS_SIGN = registerWithTab("blue_hanging_canvas_sign",
			() -> new HangingSignItem(ModBlocks.BLUE_HANGING_CANVAS_SIGN.get(), ModBlocks.BLUE_HANGING_CANVAS_WALL_SIGN.get(), basicItem()));

	public static final Supplier<Item> PURPLE_CANVAS_SIGN = registerWithTab("purple_canvas_sign",
			() -> new SignItem(basicItem(), ModBlocks.PURPLE_CANVAS_SIGN.get(), ModBlocks.PURPLE_CANVAS_WALL_SIGN.get()));
	public static final Supplier<Item> PURPLE_HANGING_CANVAS_SIGN = registerWithTab("purple_hanging_canvas_sign",
			() -> new HangingSignItem(ModBlocks.PURPLE_HANGING_CANVAS_SIGN.get(), ModBlocks.PURPLE_HANGING_CANVAS_WALL_SIGN.get(), basicItem()));

	public static final Supplier<Item> MAGENTA_CANVAS_SIGN = registerWithTab("magenta_canvas_sign",
			() -> new SignItem(basicItem(), ModBlocks.MAGENTA_CANVAS_SIGN.get(), ModBlocks.MAGENTA_CANVAS_WALL_SIGN.get()));
	public static final Supplier<Item> MAGENTA_HANGING_CANVAS_SIGN = registerWithTab("magenta_hanging_canvas_sign",
			() -> new HangingSignItem(ModBlocks.MAGENTA_HANGING_CANVAS_SIGN.get(), ModBlocks.MAGENTA_HANGING_CANVAS_WALL_SIGN.get(), basicItem()));

	public static final Supplier<Item> PINK_CANVAS_SIGN = registerWithTab("pink_canvas_sign",
			() -> new SignItem(basicItem(), ModBlocks.PINK_CANVAS_SIGN.get(), ModBlocks.PINK_CANVAS_WALL_SIGN.get()));
	public static final Supplier<Item> PINK_HANGING_CANVAS_SIGN = registerWithTab("pink_hanging_canvas_sign",
			() -> new HangingSignItem(ModBlocks.PINK_HANGING_CANVAS_SIGN.get(), ModBlocks.PINK_HANGING_CANVAS_WALL_SIGN.get(), basicItem()));

	// Tools
	public static final Supplier<Item> FLINT_KNIFE = registerWithTab("flint_knife",
			() -> new KnifeItem(ModMaterials.FLINT, knifeItem(ModMaterials.FLINT)));
	public static final Supplier<Item> IRON_KNIFE = registerWithTab("iron_knife",
			() -> new KnifeItem(Tiers.IRON, knifeItem(Tiers.IRON)));
	public static final Supplier<Item> DIAMOND_KNIFE = registerWithTab("diamond_knife",
			() -> new KnifeItem(Tiers.DIAMOND, knifeItem(Tiers.DIAMOND)));
	public static final Supplier<Item> NETHERITE_KNIFE = registerWithTab("netherite_knife",
			() -> new KnifeItem(Tiers.NETHERITE, knifeItem(Tiers.NETHERITE).fireResistant()));
	public static final Supplier<Item> GOLDEN_KNIFE = registerWithTab("golden_knife",
			() -> new KnifeItem(Tiers.GOLD, knifeItem(Tiers.GOLD)));

	public static final Supplier<Item> STRAW = registerWithTab("straw", () -> new FuelItem(basicItem()));
	public static final Supplier<Item> CANVAS = registerWithTab("canvas", () -> new FuelItem(basicItem(), 400));
	public static final Supplier<Item> TREE_BARK = registerWithTab("tree_bark", () -> new FuelItem(basicItem(), 200));

	// Wild Crops
	public static final Supplier<Item> SANDY_SHRUB = registerWithTab("sandy_shrub",
			() -> new BlockItem(ModBlocks.SANDY_SHRUB.get(), basicItem()));
	public static final Supplier<Item> WILD_CABBAGES = registerWithTab("wild_cabbages",
			() -> new BlockItem(ModBlocks.WILD_CABBAGES.get(), basicItem()));
	public static final Supplier<Item> WILD_ONIONS = registerWithTab("wild_onions",
			() -> new BlockItem(ModBlocks.WILD_ONIONS.get(), basicItem()));
	public static final Supplier<Item> WILD_TOMATOES = registerWithTab("wild_tomatoes",
			() -> new BlockItem(ModBlocks.WILD_TOMATOES.get(), basicItem()));
	public static final Supplier<Item> WILD_CARROTS = registerWithTab("wild_carrots",
			() -> new BlockItem(ModBlocks.WILD_CARROTS.get(), basicItem()));
	public static final Supplier<Item> WILD_POTATOES = registerWithTab("wild_potatoes",
			() -> new BlockItem(ModBlocks.WILD_POTATOES.get(), basicItem()));
	public static final Supplier<Item> WILD_BEETROOTS = registerWithTab("wild_beetroots",
			() -> new BlockItem(ModBlocks.WILD_BEETROOTS.get(), basicItem()));
	public static final Supplier<Item> WILD_RICE = registerWithTab("wild_rice",
			() -> new DoubleHighBlockItem(ModBlocks.WILD_RICE.get(), basicItem()));

	public static final Supplier<Item> BROWN_MUSHROOM_COLONY = registerWithTab("brown_mushroom_colony",
			() -> new MushroomColonyItem(ModBlocks.BROWN_MUSHROOM_COLONY.get(), basicItem()));
	public static final Supplier<Item> RED_MUSHROOM_COLONY = registerWithTab("red_mushroom_colony",
			() -> new MushroomColonyItem(ModBlocks.RED_MUSHROOM_COLONY.get(), basicItem()));

	// Basic Crops
	public static final Supplier<Item> CABBAGE = registerWithTab("cabbage",
			() -> new Item(foodItem(FoodValues.CABBAGE).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(8000).protein(0).insulinResponse(0).build())));
	public static final Supplier<Item> TOMATO = registerWithTab("tomato",
			() -> new Item(foodItem(FoodValues.TOMATO).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(8000).protein(0).insulinResponse(0).build())));
	public static final Supplier<Item> ONION = registerWithTab("onion",
			() -> new ItemNameBlockItem(ModBlocks.ONION_CROP.get(), foodItem(FoodValues.ONION).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(8000).protein(0).insulinResponse(0).build())));
	public static final Supplier<Item> RICE_PANICLE = registerWithTab("rice_panicle", () -> new Item(basicItem()));
	public static final Supplier<Item> RICE = registerWithTab("rice",
			() -> new RiceItem(ModBlocks.RICE_CROP.get(), basicItem()));
	public static final Supplier<Item> CABBAGE_SEEDS = registerWithTab("cabbage_seeds", () -> new ItemNameBlockItem(ModBlocks.CABBAGE_CROP.get(), basicItem()));
	public static final Supplier<Item> TOMATO_SEEDS = registerWithTab("tomato_seeds", () -> new ItemNameBlockItem(ModBlocks.BUDDING_TOMATO_CROP.get(), basicItem()) {

		@Override
		public void registerBlocks(Map<Block, Item> blockToItemMap, Item item) {
			super.registerBlocks(blockToItemMap, item);
			blockToItemMap.put(ModBlocks.TOMATO_CROP.get(), item);
		}

	});

		public static final Supplier<Item> ROTTEN_TOMATO = registerWithTab("rotten_tomato",
				() -> new RottenTomatoItem(new Item.Properties().stacksTo(16)));

		// Foodstuffs
		public static final Supplier<Item> FRIED_EGG = registerWithTab("fried_egg",
				() -> new Item(foodItem(FoodValues.FRIED_EGG).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(48000).insulinResponse(0).build())));
		public static final Supplier<Item> MILK_BOTTLE = registerWithTab("milk_bottle",
				() -> new MilkBottleItem(drinkItem().component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(8000).insulinResponse(0).build())));
		public static final Supplier<Item> HOT_COCOA = registerWithTab("hot_cocoa",
				() -> new HotCocoaItem(drinkItem().component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(8000).insulinResponse(4800).build())));
		public static final Supplier<Item> APPLE_CIDER = registerWithTab("apple_cider",
				() -> new DrinkableItem(drinkItem().food(FoodValues.APPLE_CIDER).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(16000).protein(0).insulinResponse(4800).build()), true, false));
		public static final Supplier<Item> MELON_JUICE = registerWithTab("melon_juice",
				() -> new HotCocoaItem(drinkItem().component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(32000).protein(0).insulinResponse(24000).build())));
		public static final Supplier<Item> TOMATO_SAUCE = registerWithTab("tomato_sauce",
				() -> new Item(foodItem(FoodValues.TOMATO_SAUCE).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(16000).protein(0).insulinResponse(0).build())));
		public static final Supplier<Item> WHEAT_DOUGH = registerWithTab("wheat_dough",
				() -> new Item(foodItem(FoodValues.WHEAT_DOUGH)));
		public static final Supplier<Item> RAW_PASTA = registerWithTab("raw_pasta",
				() -> new Item(foodItem(FoodValues.RAW_PASTA)));
		public static final Supplier<Item> PUMPKIN_SLICE = registerWithTab("pumpkin_slice",
				() -> new Item(foodItem(FoodValues.PUMPKIN_SLICE).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(4000).protein(0).insulinResponse(0).build())));
		public static final Supplier<Item> CABBAGE_LEAF = registerWithTab("cabbage_leaf",
				() -> new Item(foodItem(FoodValues.CABBAGE_LEAF).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(4000).protein(0).insulinResponse(0).build())));
		public static final Supplier<Item> MINCED_BEEF = registerWithTab("minced_beef",
				() -> new Item(foodItem(FoodValues.MINCED_BEEF).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(20000).insulinResponse(0).build())));
		public static final Supplier<Item> BEEF_PATTY = registerWithTab("beef_patty",
				() -> new Item(foodItem(FoodValues.BEEF_PATTY).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(40000).insulinResponse(0).build())));
		public static final Supplier<Item> CHICKEN_CUTS = registerWithTab("chicken_cuts",
				() -> new Item(foodItem(FoodValues.CHICKEN_CUTS).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(12000).insulinResponse(0).build())));
		public static final Supplier<Item> COOKED_CHICKEN_CUTS = registerWithTab("cooked_chicken_cuts",
				() -> new Item(foodItem(FoodValues.CHICKEN_CUTS).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(24000).insulinResponse(0).build())));
		public static final Supplier<Item> BACON = registerWithTab("bacon",
				() -> new Item(foodItem(FoodValues.BACON).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(16000).insulinResponse(0).build())));
		public static final Supplier<Item> COOKED_BACON = registerWithTab("cooked_bacon",
				() -> new Item(foodItem(FoodValues.COOKED_BACON).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(32000).insulinResponse(0).build())));
		public static final Supplier<Item> COD_SLICE = registerWithTab("cod_slice",
				() -> new Item(foodItem(FoodValues.COD_SLICE).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(8000).insulinResponse(0).build())));
		public static final Supplier<Item> COOKED_COD_SLICE = registerWithTab("cooked_cod_slice",
				() -> new Item(foodItem(FoodValues.COOKED_COD_SLICE).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(20000).insulinResponse(0).build())));
		public static final Supplier<Item> SALMON_SLICE = registerWithTab("salmon_slice",
				() -> new Item(foodItem(FoodValues.SALMON_SLICE).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(8000).insulinResponse(0).build())));
		public static final Supplier<Item> COOKED_SALMON_SLICE = registerWithTab("cooked_salmon_slice",
				() -> new Item(foodItem(FoodValues.COOKED_SALMON_SLICE).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(24000).insulinResponse(0).build())));
		public static final Supplier<Item> MUTTON_CHOPS = registerWithTab("mutton_chops",
				() -> new Item(foodItem(FoodValues.MUTTON_CHOPS).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(12000).insulinResponse(0).build())));
		public static final Supplier<Item> COOKED_MUTTON_CHOPS = registerWithTab("cooked_mutton_chops",
				() -> new Item(foodItem(FoodValues.COOKED_MUTTON_CHOPS).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(24000).insulinResponse(0).build())));
		public static final Supplier<Item> HAM = registerWithTab("ham",
				() -> new Item(foodItem(FoodValues.HAM).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(40000).insulinResponse(0).build())));
		public static final Supplier<Item> SMOKED_HAM = registerWithTab("smoked_ham",
				() -> new Item(foodItem(FoodValues.SMOKED_HAM).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(80000).insulinResponse(0).build())));

		// Sweets
		public static final Supplier<Item> PIE_CRUST = registerWithTab("pie_crust",
				() -> new Item(foodItem(FoodValues.PIE_CRUST).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(8000).insulinResponse(0).build())));
		public static final Supplier<Item> APPLE_PIE = registerWithTab("apple_pie",
				() -> new BlockItem(ModBlocks.APPLE_PIE.get(), basicItem()));
		public static final Supplier<Item> SWEET_BERRY_CHEESECAKE = registerWithTab("sweet_berry_cheesecake",
				() -> new BlockItem(ModBlocks.SWEET_BERRY_CHEESECAKE.get(), basicItem()));
		public static final Supplier<Item> CHOCOLATE_PIE = registerWithTab("chocolate_pie",
				() -> new BlockItem(ModBlocks.CHOCOLATE_PIE.get(), basicItem()));
		public static final Supplier<Item> CAKE_SLICE = registerWithTab("cake_slice",
				() -> new Item(foodItem(FoodValues.CAKE_SLICE)));
		public static final Supplier<Item> APPLE_PIE_SLICE = registerWithTab("apple_pie_slice",
				() -> new Item(foodItem(FoodValues.PIE_SLICE).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(6000).protein(2000).insulinResponse(2400).build())));
		public static final Supplier<Item> SWEET_BERRY_CHEESECAKE_SLICE = registerWithTab("sweet_berry_cheesecake_slice",
				() -> new Item(foodItem(FoodValues.PIE_SLICE).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(12000).protein(6000).insulinResponse(7200).build())));
		public static final Supplier<Item> CHOCOLATE_PIE_SLICE = registerWithTab("chocolate_pie_slice",
				() -> new Item(foodItem(FoodValues.PIE_SLICE).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(8000).insulinResponse(2400).build())));
		public static final Supplier<Item> SWEET_BERRY_COOKIE = registerWithTab("sweet_berry_cookie",
				() -> new Item(foodItem(FoodValues.COOKIES).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(1000).protein(0).insulinResponse(480).build())));
		public static final Supplier<Item> HONEY_COOKIE = registerWithTab("honey_cookie",
				() -> new Item(foodItem(FoodValues.COOKIES).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(0).insulinResponse(1400).build())));
		public static final Supplier<Item> MELON_POPSICLE = registerWithTab("melon_popsicle",
				() -> new Item(foodItem(FoodValues.POPSICLE).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(32000).protein(0).insulinResponse(19200).build())));
		public static final Supplier<Item> GLOW_BERRY_CUSTARD = registerWithTab("glow_berry_custard",
				() -> new ConsumableItem(foodItem(FoodValues.GLOW_BERRY_CUSTARD).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(8000).protein(32000).insulinResponse(9600).build())));
		public static final Supplier<Item> FRUIT_SALAD = registerWithTab("fruit_salad",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.FRUIT_SALAD).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(44000).protein(0).insulinResponse(19200).build()), true));

		// Basic Meals
		public static final Supplier<Item> MIXED_SALAD = registerWithTab("mixed_salad",
				() -> new Item(foodItem(FoodValues.MIXED_SALAD).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(19000).protein(0).insulinResponse(0).build())));
		public static final Supplier<Item> NETHER_SALAD = registerWithTab("nether_salad",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.NETHER_SALAD)));
		public static final Supplier<Item> BARBECUE_STICK = registerWithTab("barbecue_stick",
				() -> new Item(foodItem(FoodValues.BARBECUE_STICK).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(16000).protein(32000).insulinResponse(0).build())));
		public static final Supplier<Item> EGG_SANDWICH = registerWithTab("egg_sandwich",
				() -> new Item(foodItem(FoodValues.EGG_SANDWICH).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(96000).insulinResponse(0).build())));
		public static final Supplier<Item> CHICKEN_SANDWICH = registerWithTab("chicken_sandwich",
				() -> new Item(foodItem(FoodValues.CHICKEN_SANDWICH).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(24000).protein(32000).insulinResponse(0).build())));
		public static final Supplier<Item> HAMBURGER = registerWithTab("hamburger",
				() -> new Item(foodItem(FoodValues.HAMBURGER).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(24000).protein(40000).insulinResponse(0).build())));
		public static final Supplier<Item> BACON_SANDWICH = registerWithTab("bacon_sandwich",
				() -> new Item(foodItem(FoodValues.BACON_SANDWICH).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(16000).protein(32000).insulinResponse(0).build())));
		public static final Supplier<Item> MUTTON_WRAP = registerWithTab("mutton_wrap",
				() -> new Item(foodItem(FoodValues.MUTTON_WRAP).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(16000).protein(32000).insulinResponse(0).build())));
		public static final Supplier<Item> DUMPLINGS = registerWithTab("dumplings",
				() -> new Item(foodItem(FoodValues.DUMPLINGS).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(16000).protein(32000).insulinResponse(0).build())));
		public static final Supplier<Item> STUFFED_POTATO = registerWithTab("stuffed_potato",
				() -> new Item(foodItem(FoodValues.STUFFED_POTATO).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(80000).insulinResponse(0).build())));
		public static final Supplier<Item> CABBAGE_ROLLS = registerWithTab("cabbage_rolls",
				() -> new Item(foodItem(FoodValues.CABBAGE_ROLLS).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(8000).protein(32000).insulinResponse(0).build())));
		public static final Supplier<Item> SALMON_ROLL = registerWithTab("salmon_roll",
				() -> new Item(foodItem(FoodValues.SALMON_ROLL).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(8000).insulinResponse(0).build())));
		public static final Supplier<Item> COD_ROLL = registerWithTab("cod_roll",
				() -> new Item(foodItem(FoodValues.COD_ROLL).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(8000).insulinResponse(0).build())));
		public static final Supplier<Item> KELP_ROLL = registerWithTab("kelp_roll",
				() -> new Item(foodItem(FoodValues.KELP_ROLL).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(16000).protein(0).insulinResponse(0).build())));
		public static final Supplier<Item> KELP_ROLL_SLICE = registerWithTab("kelp_roll_slice",
				() -> new Item(foodItem(FoodValues.KELP_ROLL_SLICE).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(16000).protein(32000).insulinResponse(0).build())));

		// Soups and Stews
		public static final Supplier<Item> COOKED_RICE = registerWithTab("cooked_rice",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.COOKED_RICE), true));
		public static final Supplier<Item> BONE_BROTH = registerWithTab("bone_broth",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.BONE_BROTH).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(8000).protein(8000).insulinResponse(0).build()), true));
		public static final Supplier<Item> BEEF_STEW = registerWithTab("beef_stew",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.BEEF_STEW).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(16000).protein(80000).insulinResponse(0).build()), true));
		public static final Supplier<Item> CHICKEN_SOUP = registerWithTab("chicken_soup",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.CHICKEN_SOUP).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(32000).protein(48000).insulinResponse(0).build()), true));
		public static final Supplier<Item> VEGETABLE_SOUP = registerWithTab("vegetable_soup",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.VEGETABLE_SOUP).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(27000).protein(0).insulinResponse(0).build()), true));
		public static final Supplier<Item> FISH_STEW = registerWithTab("fish_stew",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.FISH_STEW).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(24000).protein(32000).insulinResponse(0).build()), true));
		public static final Supplier<Item> FRIED_RICE = registerWithTab("fried_rice",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.FRIED_RICE).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(24000).protein(24000).insulinResponse(0).build()), true));
		public static final Supplier<Item> PUMPKIN_SOUP = registerWithTab("pumpkin_soup",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.PUMPKIN_SOUP).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(12000).protein(72000).insulinResponse(0).build()), true));
		public static final Supplier<Item> BAKED_COD_STEW = registerWithTab("baked_cod_stew",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.BAKED_COD_STEW).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(8000).protein(80000).insulinResponse(0).build()), true));
		public static final Supplier<Item> NOODLE_SOUP = registerWithTab("noodle_soup",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.NOODLE_SOUP).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(8000).protein(112000).insulinResponse(0).build()), true));

		// Plated Meals
		public static final Supplier<Item> BACON_AND_EGGS = registerWithTab("bacon_and_eggs",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.BACON_AND_EGGS).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(0).protein(160000).insulinResponse(0).build()), true));
		public static final Supplier<Item> PASTA_WITH_MEATBALLS = registerWithTab("pasta_with_meatballs",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.PASTA_WITH_MEATBALLS).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(16000).protein(40000).insulinResponse(0).build()), true));
		public static final Supplier<Item> PASTA_WITH_MUTTON_CHOP = registerWithTab("pasta_with_mutton_chop",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.PASTA_WITH_MUTTON_CHOP).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(16000).protein(48000).insulinResponse(0).build()), true));
		public static final Supplier<Item> MUSHROOM_RICE = registerWithTab("mushroom_rice",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.MUSHROOM_RICE).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(16000).protein(0).insulinResponse(0).build()), true));
		public static final Supplier<Item> ROASTED_MUTTON_CHOPS = registerWithTab("roasted_mutton_chops",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.ROASTED_MUTTON_CHOPS).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(11000).protein(24000).insulinResponse(0).build()), true));
		public static final Supplier<Item> VEGETABLE_NOODLES = registerWithTab("vegetable_noodles",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.VEGETABLE_NOODLES).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(24000).protein(0).insulinResponse(0).build()), true));
		public static final Supplier<Item> STEAK_AND_POTATOES = registerWithTab("steak_and_potatoes",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.STEAK_AND_POTATOES).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(8000).protein(80000).insulinResponse(0).build()), true));
		public static final Supplier<Item> RATATOUILLE = registerWithTab("ratatouille",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.RATATOUILLE).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(27000).protein(0).insulinResponse(0).build()), true));
		public static final Supplier<Item> SQUID_INK_PASTA = registerWithTab("squid_ink_pasta",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.SQUID_INK_PASTA).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(8000).protein(48000).insulinResponse(0).build()), true));
		public static final Supplier<Item> GRILLED_SALMON = registerWithTab("grilled_salmon",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.GRILLED_SALMON).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(24000).protein(48000).insulinResponse(0).build()), true));

		// Feasts
		public static final Supplier<Item> ROAST_CHICKEN_BLOCK = registerWithTab("roast_chicken_block",
				() -> new BlockItem(ModBlocks.ROAST_CHICKEN_BLOCK.get(), basicItem().stacksTo(1)));
		public static final Supplier<Item> ROAST_CHICKEN = registerWithTab("roast_chicken",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.ROAST_CHICKEN).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(10000).protein(18000).insulinResponse(0).build()), true));

		public static final Supplier<Item> STUFFED_PUMPKIN_BLOCK = registerWithTab("stuffed_pumpkin_block",
				() -> new BlockItem(ModBlocks.STUFFED_PUMPKIN_BLOCK.get(), basicItem().stacksTo(1)));
		public static final Supplier<Item> STUFFED_PUMPKIN = registerWithTab("stuffed_pumpkin",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.STUFFED_PUMPKIN).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(12000).protein(0).insulinResponse(1200).build()), true));

		public static final Supplier<Item> HONEY_GLAZED_HAM_BLOCK = registerWithTab("honey_glazed_ham_block",
				() -> new BlockItem(ModBlocks.HONEY_GLAZED_HAM_BLOCK.get(), basicItem().stacksTo(1)));
		public static final Supplier<Item> HONEY_GLAZED_HAM = registerWithTab("honey_glazed_ham",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.HONEY_GLAZED_HAM).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(8000).protein(20000).insulinResponse(3500).build()), true));

		public static final Supplier<Item> SHEPHERDS_PIE_BLOCK = registerWithTab("shepherds_pie_block",
				() -> new BlockItem(ModBlocks.SHEPHERDS_PIE_BLOCK.get(), basicItem().stacksTo(1)));
		public static final Supplier<Item> SHEPHERDS_PIE = registerWithTab("shepherds_pie",
				() -> new ConsumableItem(bowlFoodItem(FoodValues.SHEPHERDS_PIE).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(4000).protein(44000).insulinResponse(0).build()), true));

		public static final Supplier<Item> RICE_ROLL_MEDLEY_BLOCK = registerWithTab("rice_roll_medley_block",
				() -> new BlockItem(ModBlocks.RICE_ROLL_MEDLEY_BLOCK.get(), basicItem().stacksTo(1)));

		// Pet Foods
		public static final Supplier<Item> DOG_FOOD = registerWithTab("dog_food",
				() -> new DogFoodItem(bowlFoodItem(FoodValues.DOG_FOOD).component(IFWDataComponents.ifw_food_data, new IFWFoodProperties.Builder().phytonutrients(555).protein(555).insulinResponse(555).build())));
		public static final Supplier<Item> HORSE_FEED = registerWithTab("horse_feed",
				() -> new HorseFeedItem(basicItem().stacksTo(16)));
	}
