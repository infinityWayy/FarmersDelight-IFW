# Changelog

## 1.2.8

### Updates
- Wheat Dough now has a simpler, less cumbersome crafting recipe:
  - Wheat can be crafted with a Water Bucket to make Dough. The bucket's water won't be depleted, letting you craft dough indefinitely;
  - The bucket acts as a simple technology gate to unlock this recipe;
  - The previous recipes, both water-based and egg-based, were removed;
- Wheat Dough and Raw Pasta no longer have a chance to cause the Hunger effect when eaten, as those items are no longer crafted with Eggs;

### Fixes
- Fixed Jack-O-Lantern not being mineable with a Knife;
- Fixed Create's Potato Cannon integration;
- Fixed budding bushes (Tomato)'s planting rules being hardcoded to vanilla farmland;
- (1.21.1) Fixed Baskets and Cabinets not having an item handler capability (thanks, RaymondBlaze!);
- (1.21.1) Updated Create Integration to the newest update's syntax (thanks, mpustovoi!);
- (1.21.1) Fixed `storage_blocks` tags not being nested in their parent (thanks, Lucky-56!);
- (1.21.1) Fixed FD recipe ID's not being displayed on debug info on JEI screens (thanks, Abbie5!);
- (1.21.1) Fixed Immersive Engineering integration recipes;
- (1.21.1) Fixed Tall-mato advancement not working properly;
- (1.21.1) Fixed HUD overlays rendering on top of AppleSkin overlays;

### Translations
- Updated:
  - es_es (thanks, GGlangf!);
  - zh_cn (thanks, NumberSir!);

## 1.2.7

### Updates
- Knives are now effective at mining Cactus;
- Knives can now instamine Bamboo, just like a Sword;
- Added the following blocks to the `unaffected_by_rich_soil` tag:
  - Moss, Nylium, Big Dripleaf, Pink Petals and Tall Flowers;
- Added `storage_blocks/<material>` tags for each storage block (crates, bags, bales) in the mod:
  - In 1.20.1, the namespace is `forge`;
  - In 1.21.1, the namespace is `c`;
- Rich Soil is no longer hardcoded to deny tall flower boosting; they have simply been added to the `unaffected_by_rich_soil` tag;

### Fixes
- Fixed wrong UV at the bottom of Pie models when there's 1 slice left;
- (1.21) Fix Pumpkins always dropping Pumpkin Slices without needing a knife;

### Translations
- Updated:
  - es_cl (thanks, Ganbare-Lucifer!);
  - id_id (thanks, ichirei!);
  - zh_cn (thanks, Boshigiri!);

## 1.2.6

### Additions
- Farmer's Delight crops will now generate in village farms!
  - Cabbage, Tomato and Onion will randomly replace either Wheat or Potato crops in villages;
  - Crop availability varies between arid, temperate and cold biomes;
  - Rice is excluded, as it requires a custom structure, and Villagers can't farm it yet.
- Added cutting recipe for Torchflower;

### Fixes
- Fix Skillet's default block state having `waterlogged=true`;
- Fix `tomatoes` not having a map color;
- (1.21) Fix Cutting Board recipes crashing with recipe optimization mods;
- (1.21) Fix Anvil being able to add Sweeping Edge to knives and skillets;
- (1.21) Fix Skillets lacking item data when placed via commands, causing crashes and inconsistencies;

### Translations
- Added:
  - en_nz (thanks, XlosVSM!);
  - vp_vl (thanks, SquareScreamYT!);
- Updated:
  - es_mx (thanks, cerealconjugo!);
  - ja_jp (thanks, Abbage230!);
  - zh_cn (thanks, NumberSir!);

## 1.2.5

### Additions
- Farmer Villagers are now capable of planting and harvesting FD crops!
  - They can plant, harvest and collect the drops for Cabbage, Tomato and Onion;
  - Rice is currently excluded from this equation, as farmer AI wasn't able to handle it properly without extensive changes.
- Added tag: `farmersdelight:campfire_signal_smoke`. Blocks in this tag will cause Campfires to emit "signal smoke", like the Hay Bale;

### Updates
- Knives are now effective at mining Pumpkins (normal and carved) and Melons;
- Knives will harvest **4 Pumpkin Slices** when mining a Pumpkin, instead of a whole unit. Carved Pumpkins are unaffected;
- Added Canvas Signs to the vanilla `signs` and `hanging_signs` item tags;
- Some crafting recipes are now properly grouped in the Crafting Table's recipe book;
- Skillets are now waterloggable, but are unable to cook underwater, either handheld or as a block. Hard to fry when the skillet is flooded!
- `tomatoes` were temporarily removed from the `crops` tag, as bee pollination was breaking ropelogged vines unpredictably;
  - This will likely be addressed in the next major release;
  
### Fixes
- Fix meal duplication when using containers against a Cooking Pot block, then closing and reloading the world;

### Fixes
- Fix meal duplication when using containers against a Cooking Pot block, then closing and reloading the world;
- (1.21) Fixed Kelp Roll (whole) having wrong food stats;
- (1.21) Fixed Skillet not being enchantable in an anvil;
- (1.21) Fixed Knives being unable to receive Knockback and Looting;
- (1.21) Fixed Cutting Boards being unable to handle two valid tools for the same input (thanks, Lance5057!);
- (1.21) Fixed Skillets not losing durability when attacking mobs;

### Translations
- Added:
  - be_by (thanks, observr1!)
  - da_dk (thanks, gohkenytp!)
  - en_gb (thanks, akkini1!)
  - tok (thanks, PiggyDr!)
- Updated:
  - de_de (thanks, joernott and DaLumma!)
  - es_ar (thanks, axperty!)
  - es_mx (thanks, cerealconjugo!)
  - ja_jp (thanks, konumatakaki and EndilCrafter!)
  - ko_kr (thanks, smoong951!)
  - ru_ru (thanks, mpustovoi!)
  - uk_ua (thanks, TheGridExpert!)
  - vi_vn (thanks, godkyo98!)
  - zh_cn (thanks, DuckDuckStudio!)
  - zh_tw (thanks, DuckDuckStudio and FuGu0416!)

## 1.2.4a (1.21)

### Fixes
- Fix crash when placing Mangrove Cabinet, Canvas Signs or Hanging Canvas Signs;
- Fix sporadic CME crash due to item override registration;
- Fix meal duplication when using containers against a Cooking Pot block, then closing and reloading the world;

### Translations
- Updated:
  - de_de (thanks, DaLumma!)
  - es_mx (thanks, cerealconjugo!)
  - ja_jp (thanks, EndilCrafter!)
  - ru_ru (thanks, mpustovoi!)
  - uk_ua (thanks, TheGridExpert!)

## 1.2.4

### Updates
- (1.21) All `forge` tags have been updated to the `c` namespace, with a few changes and additions:
  - Updated many tags to reside within the `c:foods/` subgroup, except for `c:crops/grain`, since the items are inedible;
  - Many tags which had specific subgrouping were sunsetted.
    - For example: forge:vegetables/tomato was phased out due to redundancy, in favor of c:foods/tomato instead, but tomatoes are still added to c:foods/vegetables;
  - Removed `farmersdelight:wolf_prey`, in favor of using `c:foods/raw_meat` instead;
  - Added `c:foods/safe_raw_fish`, a version of `c:foods/raw_fish` which does not include Pufferfish;
- The Cooking Pot item now displays more information than before:
  - A blue bar will be shown to indicate the amount of meal servings stored, similar to how Bundles display their fullness;
  - The tooltip will display the stored food's item sprite alongside its name;
- When viewing basic crops in JEI, they will display info on where they can be found as Wild Crops.

### Fixes
- (1.20) Creative Tab registration has been moved to server-side, so that other mods can access them for game logic;
- Structure files for compost heaps are now format-updated with datagen, thus avoiding excessive DFU triggers on world gen. This should improve performance!
  - Credit to malte0811, co-author of Immersive Engineering, for the StructureUpdater implementation;
- Skillet's higher knockback is now implemented as an attribute, rather than an event, fixing a bug where the other hand's item also received this boost;
- Skillet sounds now play at the correct stage of the damage cycle. This is noticeable on multiplayer, with some amount of latency;

### Translations
- Added a line for the Rotten Tomato entity in most langs (thanks, leagris!);
- Added:
  - sv_SE (thanks, Bjorkan!);
- Updated:
  - es_MX (thanks, CerealConJugo!);
  - fr_FR (thanks, leagris!);
  - ja_JP (thanks, EndilCrafter!)
  - ru_RU (thanks, VGamerGroup!);
  - uk_UA (thanks, unroman!);
  - zh_CN (thanks, NumberSir);
  - zh_TW (thanks, Lobster0228!);

## 1.2.3

### Additions
- Added certain blocks to the `create:brittle` tag, to prevent them from being deleted randomly when disassembling contraptions;
- New tags:
  - `farmersdelight:flat_on_cutting_board`: Items which will always render flat and 2D when placed on a Cutting Board, to fix certain render cases.
    - Includes Trident and Spyglass by default, due to unique render cases;
    - Optionally includes items from a few mods, such as Autumnity's Turkey and Supplementaries' Quiver;

### Updates
- Updated method of modifying stack sizes for BowlFoodItems:
  - Changes are now done on game start, rather than calculated during `maxStackSize()` calls;
  - The `overrideAllSoupItems` config option has been removed, due to performance and usability concerns;
- Cooking recipes will now drop sensible remainders for vanilla items which don't have them configured;
- (1.20) Updated Basket textures to match the new Bamboo design and palette;

### Fixes
- Fix potential performance issues involving the stack size override for BowlFoodItems (see above);
- (1.18.2) Rollback and replacement to previous fix for Cutting Board's rendering issues with perspective items:
  - The previous fix fails (and may crash) with some resource packs on 1.18.2, due to differences in how the method operates. On 1.19+, the fix works as intended;
  - Instead of applying perspectives to determine 3D items, the `flat_on_cutting_board` tag will be used instead. Wrongly-angled items should be added to this tag;

### Translations
- Updated:
  - ko_KR (thanks, Yusi0!);
  - pl_PL (thanks, jogurciQ!);

## 1.2.2a

### Fixes
- Fix recursion crash when opening loot chests;

## 1.2.2

### Additions
- (1.20) Added Hanging Canvas Signs;
- (1.20) Added Cherry and Bamboo Cabinets;
- (1.20) Added salvaging recipes for Cherry and Bamboo furniture;
- Added compatibility with the `origins:meat` tag from the Origins mod:
  - Carnivorous foods not defined as `meat()` in properties;
  - Bacon and Eggs;
- Added some items to Create Crafts & Additions tags: `createaddition:plants` and `createaddition:plant_foods` (thanks, moltenwolfcub!);
- Added Onions to the `tconstruct:seeds` tag from Tinker's Construct, to replant with Harvest modifiers;
- New tags:
  - `farmersdelight:terrain`: Blocks commonly present in biome surfaces. Populated by `minecraft:dirt` and `minecraft:sand`, and used for wild crop generation;
  - `farmersdelight:horse_feed_tempted`: Entities which will be tempted by Horse Feed when held;
  - `farmersdelight:serving_containers`: Items commonly used as containers for Cooking Pot recipes. Used for shift-click logic in the UI;

### Updates
- (1.20) Updated tags to the newest conventions in 1.20:
  - `replaceable` and `replaceable_by_trees`: Sandy Shrub;
- Updated the Rope recipe to require 2 straw only, and output 4 units;
- Updated alternate Lead recipe to use Straw instead of Rope, due to Rope being cheaper now;
- Updated the Cooking Pot's GUI with a small arrow, pointing from the meal slot to the output slot;
- Updated the JEI widget for cooking recipes:
  - Slightly smaller size, to fit more recipes per page;
  - Progress arrow now shows icons for cooking time and experience, and displays those stats on mouse hover;
- Updated `create:upright_on_belt` with newer FD drinks;
- Updated `fan_heaters` to `passive_boiler_heaters`, according to Create 0.5 specs;
  - (1.18.2) `fan_heaters` is still present for legacy compatibility with Create 0.4;
- Updated Wild Cabbage and Sea Beet generation to be placeable on blocks tagged as `minecraft:sand`, instead of hardcoded to normal sand;
- Rabbits can now be fed, and are tempted by, Cabbage (whole or leaf);
- Updated Slice of Cake's texture, to be more accurate to the cake block it comes from;
- Ropes can now support center-hanging blocks beneath them, such as Lanterns;
- Tomato Seeds are now associated as an item for both `tomatoes` and `budding_tomatoes` (thanks, RaymondBlaze!);

### Fixes
- Fix Wild Crops not generating in biomes from biome mods:
  - Removes the check for `forge:is_overworld` on placed features, since the tag is unused by most mods;
  - (1.18) The NETHER, THEEND and NONE BiomeCategories are excluded from wild crop generation instead.
- Fix loot functions lacking a type, causing errors with datagen and mods (such as Roughly Enough Resources);
- Fix Lily Pads and other water plants being directly plantable on Rich Soil, as if it was water;
- Fix wrong Cutting Board rendering for items with 3D model perspectives, but a 2D sprite on inventories;
- (1.19 and below) Fix roped Tomato Vines being destroyed by water, deleting the rope;
- Fix Cooking Pot not resetting its cook time when quick-swapping recipes, such as through the Recipe Book (thanks, Umpaz!);
- Fix Comfort and Nourishment overlays not being cancellable by other mods (example: Vampirism Blood Bar);

### Translations
- Updated:
  - ru_RU (thanks, Edarlingen!);
  - es_ES (thanks, GerardPolloRebozado!);

## 1.2.1

### Updates
- CraftTweaker integration has been re-enabled (thanks, Witixin1512!):
  - This integration exposes `recipe_book_tab` and `farmersdelight:tool_action` to CT scripts;
- Updated the Cutting Board:
  - The player can no longer "attempt" to process a carved tool.
- Updated Cake and Pie slices:
  - When slicing a cake, slices will drop from the cut side in a neat little row;
  - When slicing a pie, slices will drop towards the user's side;
  - Eating either block or slice no longer causes potion particles when granting Speed to the user;
- Tomato Vines now have a slightly thinner hitbox, to facilitate clicking blocks behind them;
- Added Kelp to Crop Rotation advancement, as it can be cooked into food;
- Rich Soil Farmland now uses its own farmland template, so that resource packs won't break the model by improperly changing vanilla templates...;
- Removed local Botany Pots integration. It is now integrated within Botany Pots itself, in newer versions;

### Fixes
- (1.19) Fix Stove not emitting particles or ambient noise;
- (1.19) Fix containers (bowls, bottles etc.) not being searchable as recipe inputs in JEI;
- Fix the Crop Rotation advancement looking for `tomatoes` instead of `budding_tomatoes`, making it impossible to complete;
- Fix wrong criterion on recipes for smelting Golden Knives;
- Fix Rich Soil being turned into Rooted Dirt when growing Azalea trees on it;
  - The fix should potentially prevent other modded trees from converting Rich Soil as well.
- Fix wrong composting rates for a few items;
- Fix Stuffed Pumpkin, Kelp Rolls and Sandy Shrub not being compostable;
- Fix Skillet being able to break blocks on creative, despite being a weapon;
- Fix Mooshroom and Trader Llama not being scavengeable for Leather when killed with a Knife;
- Fix Full Tatami Mats being placeable if the space ahead is unsupported, which caused them to break instantly;
- Fix Candle Cakes not dropping slices when mined with a knife (thanks, edgarogh!);

### Translations
- Updated:
  - ca_ES (thanks, DyaMetR!);
  - de_DE (thanks, DaLumma!);
  - es_MX (thanks, cerealconjugo and Witixin1512!);
  - it_IT (thanks, BlackShadow77!);
  - ja_JP (thanks, CKenJa and ksk3110!);
  - ko_KR (thanks, qkrehf2!);
  - pl_PL (thanks, KarolOfGutovo!);
  - ru_RU (thanks, Pahuhopu!);
  - sk_SK (thanks, davx!);
  - tr_TR (thanks, gyrozeppelifan!);
  - uk_UA (thanks, unroman!);
  - vi_VN (thanks, baooduy!);
  - zh_CN (thanks, IdealNightOcean and Andows96!);
  - zh_TW (thanks, xMikux, Pancakes0228 and StarskyXIII!);

## 1.2.0

### Additions
- The Cooking Pot now has its own **Recipe Book**!
  - Opening the GUI will reveal the familiar green book button. Press it to see your current cooking recipes;
  - Recipes are unlocked in the same fashion as vanilla: by having one of its ingredients, or cooking the recipe from memory once;
  - Added optional `"recipe_book_tab"` field for cooking recipes, which lets the recipe specify which tab it goes into:
    - Valid options are `meals, drinks, misc`. If not provided, the recipe's tab will be determined in-code;
- New foods:
  - **Salmon Roll, Cod Roll and Kelp Roll** - A new way to enjoy your fishing spoils, if you're equipped with watery crops;
    - A full Kelp Roll is quite awkward to eat, so it takes a while. But if you cut it on a Cutting Board, you get bite-sized snacks to eat quickly;
  - **Bone Broth** - Spelunking? In a pinch? Bring a Cooking Pot with you, and you'll be able to make a decent broth out of bone and cave vegetation;
  - **Mushroom Rice** - A nourishing counterpart to Mushroom Stew, and a good sink for your mushroom colony farms;
  - **Glow Berry Custard** - This vibrant cave fruit goes well with cream! It's sure to make your stomach *glow* with joy, too;
- New blocks:
  - **Sandy Shrub** - A short plant which invades the beach coast, alongside Wild Cabbage and Sea Beet!
    - You can bone meal the shrub to make it spread across nearby sand;
  - **Rice Roll Medley** - Display your knife skills with a selection of salmon, cod and kelp rolls!
    - Unlike other feasts, this gives individual rolls instead of meals. No, you can't put them back after taking one, it's bad manners!;
- New tags: 
  - `forge:dough`: Used to add modded dough items to FD's recipes, and populated by Wheat Dough by default;
  - `forge:berries`: Any kind of small berry. Currently used for Stuffed Pumpkin and Fruit Salad;
  - `farmersdelight:cabinets`: This, together with `cabinets/wooden`, is used to classify cabinet items for searching, crafting and integration;
- Mushroom Colonies now generate in Mushroom Field biomes, at random growth stages;

### Updates
- The Tomato crop has been redesigned:
  - Its first four growth stages are a block called `budding_tomatoes`. The normal `tomatoes` block involves four fruiting stages;
  - The single crop works like before, growing 8 stages until it can be plucked for tomatoes;
  - Hanging rope above the crop will make it **climb it up**, growing two additional tomato-bearing vines;
- Some of the Wild Crops have received some visual upgrades, both in art and in world generation!
  - Wild Carrots, being weeds, will strangle some grass out, creating small patches of Coarse Dirt;
  - Wild Onions now scatter individual Alliums around them, making a more natural bush;
  - Tomato Shrubs and Wild Potatoes now grow amidst a bush of local foliage;
  - Wild Cabbage and Sea Beet now grow amidst a patch of Sandy Shrub, a new beach plant;
- You can now take servings from a Cooking Pot **directly in a crafting grid**, by placing the pot and a valid container on it;
- Rope can now be **reeled back into your inventory** from the top end by sneak-using with an empty hand on it;
- Updated a few recipes:
  - Knives are now crafted in a **vertical** arrangement instead of diagonal. This was done to reduce recipe conflicts with other mods;
  - Barbecue on a Stick can now be made from any cooked meat;
  - Milk Buckets and Bottles now convert between each other at a 1:4 ratio;
  - Glow Berries can substitute Sweet Berries on the Fruit Salad and Stuffed Pumpkin;
  - Stuffed Pumpkin has a simpler, more sensible recipe;
  - Safety Nets can be loosened back into 4 Rope;
- All cooking recipes have received a bump in their experience reward, since the old ratios were very pitiful;
- Mushroom Colonies have been buffed in some ways:
  - They can now grow in any light level, and do so faster than normal;
  - They can accept Bone Meal to advance growth stages;
- Skillet damage has been slightly buffed;
- Backstabbing damage multiplier has been nerfed to 1.4x, 1.6x and 1.8x;
- All kinds of valid tools can now be used by a **Dispenser** when facing a **Cutting Board**;
- Added Better Combat integration for the Skillet (mace preset);

### Fixes
- Fix Wild Crops being able to generate on non-Overworld biomes under the right conditions (such as valid dirt blocks in the Nether or End);
- Fix Rope not emitting sounds when entities are climbing on it;
- Fix minor pixel inconsistency on all cross crop templates;
- Fix Grass Block not being `unaffected_by_rich_soil`, while non-bonemealable plants such as ferns/grasses were;
- Fix Cabinets using Barrel subtitles;
- Fix Rich Soil being tillable when the block above isn't air;
- Fix Nourishment not being strong enough to counter extreme exhaustion levels, such as Lv. 255 Hunger;
  - The overlay now displays half-gilded shanks whenever the player is hurt, and can heal with hunger.

### Translations
- Added:
  - vi_VN (thanks, baooduy!);
  - uk_UA (thanks, Altegar!);
- Updated:
  - ca_ES (thanks, VerdaPegasus!);

## 1.1.2

### Additions
- Added nl_BE translation (thanks, Sv3r!);
- (1.19) Added Mangrove Cabinet;
- (1.19) Added a recipe for making Packed Mud with Straw. One unit can pack 2 Mud blocks, being twice as efficient than Wheat;
- (1.19) Added `farmersdelight:add_features_by_filter` biome modifier:
  - A more granular modifier than `forge:add_features`, with allowed and denied biome filters, as well as temperature ranges.
  - All extra filters aside from `allowed_biomes` are optional.

### Updates
- Updated the palette and textures for Ropes and Safety Nets a bit;
- Moved a few registrations to DeferredRegister, in preparation for future ports;
- Updated nl_NL translation (thanks, Sv3r!);

### Removals
- (1.19) Removed the config options for enabling/disabling Wild Crop generation, as they're now done via datapacks.

### Fixes
- Fix entities being able to pathfind over lit stoves, causing them to take damage (common victims: villagers, pets etc);
- Fix Cooking Pot resetting cooking progress, and stalling on a valid recipe, when unloading and reloading its chunk;
- Fix loot item function registries sometimes causing a race condition during mod loading;
- Fix Farmer villagers giving too much discount after every trade, when buying FD crops;
- Fix wrong lang keys in pt_BR translation;

## 1.1.1

### Additions
- Added nl_NL translation (thanks, Sv3r!);
- Added sr_SP translation (thanks, Smrtonosan!);

### Updates
- Updated de_DE translation (thanks, DaLumma!);
- Updated ko_KR translation (thanks, qkrehf2!);

### Fixes
- Fix Organic Compost not updating its comparator signal;
- Fix Rich Soil not being tillable except by instances of HoeItem, allowing custom modded hoes to work again;
- Fix Comfort overlay not following the HUD's height changes properly;

## 0.6.0 / 1.1.0

### Additions
- Added some of this mod's items (ropes, seeds, meals, knives etc.) to many chest loot tables! I'll leave most of them for you to discover. ;)
- Added `add_loot_table` loot modifier:
  - Allows for adding unmodified extra loot rolls to specified `lootTable` paths;
  - This modifier is governed by the `generateFDChestLoot` config; if set to false, it doesn't do anything.
- New cutting recipes:
  - Stone + Pickaxe -> Cobblestone;
  - Quartz Block + Pickaxe -> 4 Nether Quartz
  - Ink Sac + Knife -> 2 Black Dye;
  - Gravel + Shovel -> Gravel, 10% Flint (infinite source);
  - Deepslate + Pickaxe -> Cobbled Deepslate (1.18);
  - Amethyst Block + Pickaxe -> 4 Amethyst Shards (1.18);
- Added Rotten Tomatoes:
  - Not all tomatoes are fresh off the vine. Rarely, you might end up plucking a bad one...
  - Rotten Tomatoes are inedible and uncookable; they are meant to be **thrown** at others! Splatter that unfunny friend of yours right in the face!
  - They are also more compostable than standard tomatoes (85% chance), in case you don't want them.

### Updates
- The Comfort effect has been redesigned:
  - It no longer provides immunity to Slowness, Weakness or Hunger;
  - Now, it extends natural regeneration (or provides it, if the gamerule is disabled), no matter how hungry you are;
  - A silver sheen will scroll through your hearts to indicate the effect is active.
- The Advancement tree has been redesigned, with more basic hints accessible at the start of a world;
- Updated a few crafting recipes:
  - Dumplings are now cooked with Wheat Dough instead of Raw Pasta;
  - Wheat Dough is now craftable from 3 Wheat, and either 1 Egg or 1 Water Bucket;
  - Raw Pasta is now made by cutting Wheat Dough in a Cutting Board;
- Foods have been rebalanced:
  - Nourishment and Comfort lengths have been tweaked, based on the complexity of the dish;
  - Sandwiches no longer provide burst effects, to make them on par with other handheld foods;
- Wandering Traders now sell the mod's seeds/plantables sometimes. This can be similarly disabled in the config;
- The modifier `add_item` can now safely specify a `count` for the added item (optional);
- Stoves now have custom death messages, if one's unlucky enough to die on top of them...;
- Safety Nets have a slightly taller hitbox, to make placement easier.

### Fixes
- Fixed configuration for generating Compost Heaps on villages not working;
- Fixed Lava Cauldrons not being valid heat sources;

## 1.0.4

### Additions
- Added `drops_cake_slice` tag, used for vanilla cake variants (e.g. candle cakes) which should drop a Cake Slice (thanks, Umpaz!)
- Added no_NO translation (thanks, Bloodaxe95!);

### Updates
- Added Glow Berries to the "Crop Rotation" advancement;
- Updated it_IT (thanks, SimGitHub5!);
- Updated es_ES (thanks, STICKzilla21!);

### Fixes
- Fix Ropes replacing Lava (and any non-water fluids) when being deployed into it;
- Fix Wild Rice not working properly with modded shears;
- Fix Cabinets being in the wrong wood order in Creative;

## 1.0.3

### Fixes
- Fix crash when placing a Cooking Pot, due to a deleted method in BlockEntity, on Forge 39.0.45;
  - Requires Forge 39.0.45 or above.

## 1.0.2

### Fixes
- Fix crash involving Rice planting due to `forge:dirt` being removed in Forge 39.0.18 (using the vanilla tag instead);

## 1.0.1

### Additions
- `farmersdelight:straw_blocks` - Tag for blocks made (predominantly) out of Straw. Mineable with knives by default;
- Parrots can now be tamed using Cabbage Seeds, Tomato Seeds and Rice;

### Updates
- Candle cakes can now be sliced with a knife, dropping the first slice together with the candle;
- `farmersdelight:mineable/knife` has been properly configured:
  - Previously hardcoded material checks are now done entirely within the tag;
  - Included all cake variants, cobwebs, `#carpet` and `#wool`;
  - Included `forge:mineable/knife` by default;

### Fixes
- Fix Chickens and Pigs not being tempted by FD crops and seeds;
- Fix `forge:mineable/knife` being registered but not generated, causing reload problems on servers;
- Fix some langs still referring to `_pantry` IDs instead of `_cabinet`;
- Fix log spam regarding cooking/cutting recipe types;

## 1.0.0
- 1.17 and 1.18 port! Codebase has been cleaned up and refactored;

### Breaking Changes
- Read this: https://github.com/vectorwing/FarmersDelight/wiki/1.0-Breaking-Changes
- This port remaps a few blocks and items. This remap may sometimes fail due to mod interactions. **MAKE A BACKUP BEFORE TRYING TO MIGRATE OLD WORLDS!**
  - Remapped `rice_crop` to `rice`;
  - Remapped `rice_upper_crop` to `rice_panicles`;
  - Remapped all Pantries to Cabinets, in language and ID;
    - The game will attempt to migrate stored contents. If this fails, stored items will be deleted.
- (1.18+) Configs for Wild Crops frequencies have different values due to underlying system changes. They're much bigger numbers!
  - This may be re-tweaked in the future;

### Removals
- Removed `comfort_foods` tag. The mod now only adds the Comfort effect to vanilla SoupItems, which can be disabled in the config;

### Updates
- Moved Wild Rice from `small_flowers` to `tall_flowers`;
- Wild Crops, except for Wild Rice, can now provide effects when used to make Suspicious Stew. Curious? Try them for yourself! ;)
- Meal effect durations have been tweaked:
  - Both Comfort and Nourishment can now be obtained in ranges of 1, 3 and 5 minutes across meals;
  - Mushroom Stew and Beetroot Soup both grant 3 minutes of Comfort;
  - Rabbit Stew grants 5 minutes of Comfort, as well as a short burst of Jump Boost II;

## 0.5.5

### Updates
- Added no_NO translation (thanks, Bloodaxe95!);
- Updated it_IT (thanks, SimGitHub5!);
- Updated es_ES (thanks, STICKzilla21!);

### Fixes
- Fix Ropes replacing Lava (and any non-water fluids) when being deployed into it;
- Fix Wild Rice not working properly with modded shears;
- Fix Pantries being in the wrong wood order in Creative;

## 0.5.4

### Updates
- Updated zh_CN translation (thanks, WuzgXY-GitHub!)

### Fixes
- Fix duplication bug when adding stacks into a Skillet;
- Fix Cooking Pot not updating comparator signals for non-input slot changes;

## 0.5.3

### Updates
- Mutton Wrap no longer needs milk, and is made with an Onion instead of a Tomato;
- Cooking Pot is easier to mine by hand;
- Updated de_DE translation (thanks, DaLumma!);

### Fixes
- Fix crashes related to calling unbound tags on ItemTooltipEvent;
  - This means any items in `comfort_foods` will work, but won't have an effect tooltip to them;
- Fix Canvas Sign mixin not being marked as client;

## 0.5.2

### Additions
- Added client config for toggling extra tooltips on Farmer's Delight foods and drinks (true by default);

### Updates
- Foods now display their provided effect in their tooltip;
  - This also applies to any foods in the `comfort_foods` tag, for now;
- Food portions, such as cabbage leaves and meat cuts, are now fast to eat;
- Reduced the length of Comfort from `comfort_foods` from 5 to 2 minutes;
- Updated ja_JP translation;
- Updated ko_KR translation;
- Updated zh_CN translation;

### Fixes
- Fix Nourishment's hunger overlay blocking AppleSkin's saturation overlay;
- Fix items being used twice when adding them to a Stove;
- Fix Stoves cancelling the normal usage of invalid items when aimed at them;
- Fix inconsistencies with lit/unlit Stove textures;
- Fix Skillets resetting their cooking time when trying to add a cookable item and failing;

## 0.5.1
- This update rolls back recent package changes which caused add-ons and integrations to break.

### Additions
  - Added JEI information tabs to Knives and Ham;
  - Added `mushroom_colony_growable_on` tag: blocks that allow Mushroom Colonies to continue growing until mature;
    - This tag DOES NOT make the block form colonies! Only Rich Soil can do so for now;
  - Added compatibility with Create's Potato Cannon!
    - Cabbage packs a punch, but is cumbersome to reload;
    - Tomatoes are light, rapid-fire and embarassing to get hit by;
    - Onions are mostly the same as potatoes;
    - Whole pies work like the Pumpkin Pie. Their slices (and Pumpkin Slices) can be fired rapidly instead.
### Updates
  - Cooking Pot and Skillet are a bit easier to break by hand;
  - Melon Popsicles now douse flames when consumed, instead of giving Fire Resistance;
  - Updated ja_JP translation (thanks, CKenJa!)
### Fixes
  - Fix Skillet not saving total cooking times, making it cook items rapidly on world reload;
  - Fix a class mismatch that broke Industrial Foregoing's Hydroponic Bed integration.

## 0.5.0

### Breaking changes (BACKUP YOUR SAVES!)
- This update causes a few breaking changes. Follow this link for more info:
- https://github.com/vectorwing/FarmersDelight/wiki/0.5-Breaking-Changes

### Additions
- **Skillet** - A portable food-cooking utensil with a powerful swing!
    - Can be placed as a block (shift-use) or operated from your hand, if near a heat source;
        - Being on fire counts as a heat source when handheld!
    - Acts as a heavyweight melee weapon, packing extra knockback, but with very slow swings;
    - 1 second slower than a Smoker by default, but cooks progressively faster when enchanted with **Fire Aspect**;
    - Cannot interact with Hoppers as of now. This is pending a thinking-over later.
- New foods:
    - **Bacon and Eggs** - Plenty of cholesterol for a fresh morning!
- New drinks:
    - **Apple Cider** - A warm and simple drink to toughen you up with **Absorption** for a minute;
    - **Melon Juice** - Refreshing and healthy! **Heals 1 heart** instantly;
- **Canvas Rug** - A fuzzy, rudimentary floor cover made of Canvas;
- **Canvas Signs** - Painterly signs with a **dyeable background** and a smooth writing surface!
    - The sign is "uncolored" when first crafted, using the natural beige tone of Canvas;
    - Can be crafted with any normal dye to color its background;
    - Text can be dyed as usual by right-clicking the sign with a dye item;
    - Signs with a "dark" background color start off with white text. This can be customized in the config.

### Updates
- All workstations have been **optimized** for better performance, and now cache the previous recipes when processing;
- Pie and cake slices had their Speed buff shortened to 30 seconds; 
- Cooking Pot:
    - You now get **experience points** from cooking!
        - Just like a Furnace, retrieving meals from the output slot will reward you the experience stored so far;
        - Mining the pot will also release all stored experience;
    - The pot can now be heated **through** `heat_conductors`, up to 1 block of space:
        - By default, this applies to the metallic Hopper, letting you heat your food AND extract it at the same time!
        - Built-in support for Create's Chutes, and 1.17 Copper Blocks are planned to be tagged as such in the future;
    - You can now hang the pot from a **handle**!
        - Place the pot from under a block, and it will display a handle;
        - If a handle is shown, the pot won't display a tray at all;
        - You can toggle between tray and handle by sneak-right-clicking the pot.
    - The pot emits a new, custom steam particle when boiling;
    - The boiling sound becomes more "soupy" when the pot is storing a meal;
- Stove:
    - You can now use **Fire Charges** to light them;
    - You can now use any item with a "shovel" ToolType to extinguish them;
    - Cookable food can be placed on a Stove that isn't lit;
- Cutting Board:
    - Cutting recipes can now define a **drop chance** for each output item!
        - Chance is optional, and outputs are 100% guaranteed by default;
        - **Fortune** increases chances, if the given tool is enchanted with it. This bonus can be tweaked in the configs;
        - In FD, chances have been given to some flower-cutting and salvaging recipes;
        - Check the GitHub wiki to see how the new syntax works.
    - Updated JEI recipe displays to have dynamic outputs, and to also show drop chances;
    - Carved tools have been mirrored, so as to avoid cutting across the handle gap;
    - New cutting recipes: Wild Crops, Leather Horse Armor
- Knives:
    - Reduced swing speeds slightly;
- Rice:
    - The old, legacy form of the Rice Crop (`tall_rice_crop`) has been **permanently removed** in favor of the new one (`rice_upper_crop`). See the **Breaking Changes** for more info;
    - The Rice crop now only gives 1 panicle at a time, and bone meal is a bit less effective. This was done to control its excessive supply a bit more;

### Fixes
- Fix circular texture reference in some model templates, which caused lots of log spam with CTM;
- Fix most sounds being set to `stream` when they shouldn't be;
- Fix mugs rendering incorrectly when in the off-hand;
- Fix Mushroom Colonies allowing the usage of Bone Meal on some growth stages;
- Fix ToolIngredient checking a stale list of ingredients, making Tinker's Construct tools always match;

### Translation Updates
- (NEW!) ca_ES (thanks, VerdaPegasus!)
- de_DE (thanks, DaLumma!)
- fr_FR (thanks, BlackJamesYT!)
- ko_KR (thanks, qkrehf2!)
- pl_pl (thanks, jogurciQ!)
- ru_ru (thanks, Dimagreg!)
- zh_cn (thanks, WuzgXY-GitHub!)

## 0.4.6
- Added Serene Seasons **fertility** tags to all crops on the mod's end;
- Added new Cutting Board recipes: cutting flowers for dyes!
  - Small flowers can be cut to yield twice as much dye per usual;
  - Large flowers not included, though they may be in a future update;
- The lower half of Rice crops is now a bit sturdier, and cannot be instamined, making upper-half harvesting more convenient;
- Updated CraftTweaker integration (courtesy of eutro!):
  - Recipe Handlers have been added for Cooking Pot and Cutting Board recipes, so ingredient replacements are supported;
- Updated some item textures:
  - Rice Panicle has a new look! A bit less like corn, a lot more like real life;
  - Minor shading tweaks to a few other items;

## 0.4.5
- Fixes Baskets having their sides vanish when next to a short block;
- Fixes water render in waterlogged Baskets.

## 0.4.4
- Added a tooltip over the Cooking Pot's heat indicator, describing that it needs heat to function;
- Added the `offhand_equipment` tag:
  - Items in this tag cannot be placed in a Cutting Board from the off-hand;
  - Defaults to Shields and Create's Extendo Grip;
- Added translations:
  - pt_PT (thank you, axelrodii!)
  - tr_TR (thank you, Ali!)
  - it_IT (thank you, simcosmico!)
  - Basic Spanish lang for remaining 'es_' countries, subject to updates (thank you, FrannDzs!)
- Updated translations:
  - es_ES (thank you, FrannDzs!)
  - de_DE (thank you, DaLumma!)

## 0.4.3
- Nourished has been renamed to Nourishment, to stay consistent with vanilla effect naming;
  - The ID remains the same for now, and might change on the next major release;
- Milk Bottle and Hot Cocoa now have a "blue potion tooltip" describing what they do when consumed;
- Chickens can now be tempted/bred with the seeds of Cabbage, Tomato and Rice;
- Pigs can now be tempted/bred with Cabbage and Tomato (but not Onion, it's not very good for them!);
- Added custom icon and background for MrCrayfish's Catalogue and Configured mods (thank you, Dradon7!)
- Fixes:
  - Baskets now reliably hold their water when waterlogged, spilling it only through the open face;
  - Straw Bale and Rice Bale now create signal smoke when under campfires;
  - Nourishment Overlay now shakes with the hunger bar when some hunger is depleted;
    - It also displays even when the player has the Hunger debuff, since Nourishment nullifies its effects.
- Added translations:
  - id_id (thank you, ArikHn!)
- Updated translations:
  - ru_ru (thank you, GrayPix!)

## 0.4.2
- Full migration to 1.16.5, due to crucial Forge updates;
- Added custom CraftTweaker support, courtesy of Eutro!
  - Custom methods for adding Cooking Pot recipes, with optional container fields;
  - Custom methods for adding (and removing) Cutting Board recipes, with ToolIngredient compatibility;
- A few experiments with Tree Bark:
  - 3 Tree Bark can now be crafted into 1 Paper;
  - Tree Bark now smelts 1 item instead of half an item, making it a reliable "unit" fuel;
- Small update to Rich Soil Farmland, allowing Botania Floating Flowers to not trample it;
- Cabbage Rolls now consult the tag `farmersdelight:cabbage_roll_ingredients` for valid fillings (thank you, bagel!);
- Added config option for changing Rich Soil's chance of boosting crops every random tick (0.0 disables boosting entirely);
- Improved loot modification for knife actions:
  - Pies now drop all remaining slices when mined with a knife, similar to a Cake;
    - Loot modifier for this mechanic is now open to pack makers;
  - Knife Scavenging (e.g. leather from cows etc) has been moved away from loot injections, improving datapack compatibility;
    - For the time being, due to a technical hurdle, Hoglins will only drop 1 Ham, regardless of Looting;
- Updated translations:
  - zh_tw (thank you, Pancakes0228!)

## 0.4.1
- Certain actions will now display a status message on your HUD (similar to beds), to assist players regarding successful and failed attempts:
  - Trying to plant Rice outside of a shallow puddle;
  - Trying to cut an improper item in the Cutting Board;
  - Trying to use the wrong tool against a cuttable item in the Cutting Board;
- Shovels can now split Clay into 4 Clay Balls on the Cutting Board (come on, Mojang, make this a thing already...);
- Feasts have been slightly nerfed on Nourished length, to match other equivalent meals;
- Cabbage Rolls have been nerfed just a little bit;
- Recipe changes:
  - Raw Pasta is now made 2 at a time with 4 Wheat when using Water Buckets, to ease on water refilling;
  - Egg-based Raw Pasta remains the same ratio;
- Fixes:
  - Corrected wrong rotation on the Cooking Pot's spoon;
  - Horizontal facing blocks will now rotate properly when placed from a structure or command;
  - Improved Rich Soil tilling to increase compatibility with modded hoes;
- Updated translations:
  - zh_CN (thank you, WuzgXY!);
  - ko_KR (thank you, qkrehf2!)
  - de_DE (thank you, DaLumma!);
  - ja_JP (thank you, haru!);

## 0.4.0
- Shepherd's Pie is now a Feast!
- Mutton can now be cut into Mutton Chops, using a Cutting Board;
- New foods!
  - Roasted Mutton Chops - Another use for Beetroot! (and Mutton, I guess);
  - Mutton Wrap;
  - Cabbage Rolls - Wrap many kinds of leftovers in cabbage for a healthy snack;
  - Noodle Soup;
- Cutting Board recipes now make use of a ToolIngredient, freeing the `type` parameter and allowing custom ingredients (thank you, ochotonida!)
  - **BREAKING CHANGE! Custom axe/pickaxe cutting board recipes will have to be changed to the new format; the old syntax will no longer work!**
  - Please refer to the source code and wiki for information on the new syntax.
  - https://github.com/vectorwing/FarmersDelight/wiki/Cutting-Board-Recipes
- Vanilla soups and stews now stack up to 16, much like meals from this mod! (thank you, bagel!)
  - By default, this affects exclusively `SoupItem`'s from vanilla, using a list inside the configs. You can add more items to it, but it only affects `SoupItem` items;
  - You can configure to treat the list of items as a deny-list instead, making EVERY `SoupItem` stack to 16, except the ones listed in the config. This affects other mods, so be careful!
  - This feature can be disabled entirely in the configs.
- Dog Food and Horse Feed now consult tags for eligible entities to feed:
  - `dog_food_users` determines which living entities can be fed Dog Food;
  - `horse_feed_users` determines which living entities can be fed Horse Feed;
  - If a specified entity can be tamed, it must be tamed to accept the food. Otherwise, it can be fed right away;
- Balancing experiments (ongoing; please give feedback!):
  - The Nourished effect has been partially shortened across all meals;
  - Knives deal 0.5 less damage, but have a bit less knockback to help users deal more strikes;
  - Knives are no longer efficient at mining Leaves and Bales, since that is now the Hoe's job in 1.16;
- Integration with MC Abnormals mods has been moved to their official add-on, Abnormals Delight! Go check it out!
- Pies can now rotate horizontally, much like Feasts;
- Tatami blocks and half-mats can now rotate horizontally, to match the seams of their paired and full-mat counterparts;
- Rich Soil now emits green stars when boosting a plant. Should hopefully not be exaggerated;
- Fixes:
  - Rich Soil now respects OnCropsGrow Forge events. This fixes compatibility with Serene Seasons, but there could be more mods benefitting from it;
  - World gen code reordered a bit, should hopefully prevent crashes with OpenJ9 (but update OpenJ9 anyway, if you use it);
  - Tomatoes are now recognized as a CROP PlantType, to better integrate with modded farmlands (thank you, Foam!);
  - Pigs and Hoglins will drop Smoked Ham if they're on fire when killed with a knife (thank you, Foam!);
  - Crop blocks should now have proper langs, for WAILA compatibility and similar;
  - Fix meals vanishing when using bowls with a full inventory;
  - Meals can no longer be shift-clicked inside the meal display;
  - Rice Crop should no longer crash upon certain state updates (example: world editing, chunk removal etc);
  - Flint Knife is now repaired with Flint instead of Stone, using a custom item tier rather than the Stone tier;
  - Horse Feed is no longer consumed on Creative Mode;
- Added translations:
  - zh_TW (thank you, Pancakes0228!);
- Updated translations:
  - ru_RU (thank you, GrayPix and Alepod!);
  - zh_CN (thank you, WuzgXY!);
  - es_ES (thank you, FrannDzs!);
  - de_DE (thank you, elloellie and Foam!);

## 0.3.2
- Using a feast without a bowl will notify the player, bed-style;
- Hot Cocoa has a new look! The steam isn't animated for now, still need some feedback on it;
- Fixes:
  - JEI Plugin no longer crashes on servers. It was calling an unbound tag in the Decomposition recipe;
    - This is a temporary fix that also disables checking the recipe through the compost activators. Might be revisited on the next release;
  - Pantries now keep their given name when mined (thank you, bagel!);
  - Cutting Board directly gives items on right-click instead of popping them off;
  - Cutting Board now checks tags for defaut knife and shear sounds;
  - Wild Rice will leave behind its water when either half is broken;
  - Horse Feed tooltip now describes tamed mounts as a whole;
- Updated Advancements:
  - Added advancements for getting ham from pigs and drinking hot cocoa;
  - Made the feast advancement suggest bowls;
  - Added Netherite Knife to 'Hunt and Gather' advancement triggers;
  - Added Soul Campfire to 'Bonfire Lit' advancement triggers;
- Added translations:
  - fi_FI (thank you, Markus1002!);
  - en_PT - Pirate Speak! Them landlubbers better be sharp ta our ol' lingo now, lest ye have yer greens plunder'd!
- Updated translations:
  - ko_KR (thank you, qkrehf2!);
  - ja_JP (thank you, CKenJa!);
  - ru_RU (thank you, GrayPix!)

## 0.3.1
- Fix vanilla crop crates not having loot tables;
- Fix Rice Bale, Straw Bale and Wild Crops not being flammable (more to come later);
- Fix a visual glitch on Honey Glazed Ham's fourth serving model;
- Fix Bowls of Stuffed Pumpkin not giving a bowl back;

## 0.3.0
- Added Feasts!
  - Feasts are very large meals, made to be placed down as a block and shared with friends, or just to decorate a dinner table!
  - Once placed, use a Bowl against it to take a serving. Feasts contain 4 servings by default. It can be mined back if no servings were taken;
  - New Feasts:
    - Roast Chicken
  - Existing meals turned into Feasts:
    - Stuffed Pumpkin
    - Honey Glazed Ham
- Added blocks:
  - Straw Bale 
  - Bag of Rice
  - Storage Crates for vanilla crops: Carrot, Potato and Beetroot
    - These specific blocks can be disabled in the configs, in order to prevent recipe overlaps with Quark and Thermal Cultivation;
- Added foods:
  - Wheat Dough: A clumsy, but efficient way to get more bread from your wheat;
  - Bacon: The half-portion of a Porkchop!
    - Bacon Sandwich;
    - Usable in all Porkchop-related recipes;
  - Ham: Porkchop's older sibling!
    - Slay Pigs or Hoglins with a Knife for a chance of scavenging a Ham piece or two;
    - Ham can only be smoked, and it takes a little longer than usual;
    - Gives 1 Bone and 2 Porkchops when cut, allowing for a Peaceful source of bones.
  - Fruit Salad: Gently fulfilling, but grants Regeneration for a few seconds;
  - Melon Popsicle: When eaten, grants a very short burst of Fire Resistance in a pinch;
- Updated the Cutting Board:
  - Recipes can now specify a ToolType for axes, pickaxes and shovels instead of imaginary forge tags!
  - This should broaden cutting compatibility with every single modded tool under the sun, as far as we tested. (thank you, ConductiveFoam!)
- Updated some meals and foods:
  - Steak and Potatoes and Grilled Salmon are now crafted, instead of cooked, since their ingredients are already cooked;
  - General hunger/saturation/effect tweaks here and there.
- Updated Knives:
  - Knives can now slice a Cake on right-click;
  - Knives can now carve pumpkins like Shears;
  - Spiders can now be scavenged to guarantee at least 1 String;
- Updated Mushroom Colonies:
  - They can now be sheared whole at their highest age (5 caps), and planted back in any surface a Mushroom can be planted in;
  - They only grow more caps if planted in Rich Soil under sufficient darkness;
  - Shears can now clip colonies one cap at a time, allowing for decorative uses of middle stages;
- Updated Organic Compost and Rich Soil:
  - Brand new improved textures for both blocks!
    - Compost should now be more distinguishable from Rich Soil at later stages;
    - Rich Soil has a new look, more earthy and less slimy.
  - Rich Soil now checks the tag `farmersdelight:unaffected_by_rich_soil` for blocks that shouldn't receive growth boosts;
  - Both blocks can now sustain Mushrooms at any light level;
  - Organic Compost now checks every adjacent block for activation, encouraging clumping;
  - JEI integration explaining how Decomposition works (thank you, ConductiveFoam!)
- Update Wild Crops:
  - They can once again be bone-mealed to obtain more wild crops;
  - When bone meal is used, they proliferate in a small area, up to 10 units, similar to Mushrooms;
  - Wild Rice duplicates as an item drop, similar to Tall Flowers;
- Fixes:
  - Recipe types no longer registered twice on load;
  - Common setup for dispenser behaviors and compostables is properly enqueued to avoid race conditions;
  - Wild Crops will now respect world-gen configs again;
  - Rich Soil can now receive bamboo and grow saplings again (thank you, Jozufozu!)
- Minor graphics improvements;
- Minor data improvements.

## 0.2.4b
- Fix: Rice and Tomato Seeds had inverted tags;
- Fix: Game crash when using a Bucket on the bottom half of a rice crop;
- Fix: Cutting Board now uses the proper Forge Tag for shears;
- Fix: Wild Crops couldn't be sheared by modded shears;
- Change the amount of rice dropped from the crop, to match the redesign ratios;
- Add Rice Bale as an ingredient for Horse Feed;
- Make Raw Pasta edible... at a risk;
- Add: Spanish translation (thanks to tild09!)
- Update the looks on the mod's logo.

## 0.2.4a
- Fix: Wrong Pair import when getting Dog Food tooltip.

## 0.2.4
- The Rice crop has been redesigned!
  - The top half of the crop can now be harvested individually. The bottom half will stay planted, and eventually regrow a top half;
  - Bottom half yields a single pile of Rice when broken;
  - Top half is a standard crop, which yields Rice Panicles when fully grown, or Rice/Straw when harvested with a Knife;
  - Fully compatible with vanilla pistons, mechanical automation methods, Quark's simple harvesting, Immersive Engineering's Garden Cloche, and Botany Pots;
  - Existing Rice crops planted in the world will remain as the old form for compatibility. Simply harvest them and replant rice to get the new form!
- Wild Rice now generates in Swamps, Jungles and Bamboo Jungles:
  - Somewhat more common than other wild crops, due to the rarity of these biomes;
  - Yields a single pile of Rice, and can be sheared.
- Seed-bearing Wild Crops (cabbage, beet and tomato) have a small chance of dropping an edible produce when harvested;
- Wild Crop bone meal action temporarily removed due to an exploit;
- Fixed Dog Food:
  - When fed to your pet wolf, it fully heals them and grants them Speed, Strength and Resistance;
- Added Horse Feed:
  - When fed to any tamed ridable mob (horse, donkey, llama etc.), it fully heals them and grants them Speed II and Jump Boost;
  - Does not work for Pigs and Striders, as they cannot be tamed;
- When players have the Nourished effect, the hunger bar will look gilded and shiny:
  - The gilded coating will visually "peel in half" when the player is spending saturation to heal damage;
  - This overlay can be disabled in the new "farmnersdelight-client.toml" config;
- If a bell has ropes hanging from under it, players can ring the bell by right-clicking the rope column (24 blocks max.);
- Some JEI quality-of-life features:
  - Press "uses" (U) on a Stove to see the Campfire Cooking recipe tab;
  - Press "uses" (U) on a container item (e.g. Bowl) to see which Cooking Pot recipes it can be served on;
  - Cooking Pot recipes now have a "Move Items" transfer button when checking recipes on it;
- Graphics updates for some blocks and items;
- Resource pack makers: I was previously using 'textures/blocks' instead of 'textures/block'. This version fixes it, so you may have to change it too.
- Translation updates:
  - Updated Chinese (thanks to WuzgXY-GitHub, TUsama and ChillirCR!);
  - Updated German (thanks to SebastianD334 and Moralle!);
  - Added Korean (thanks to qkrehf2!);
  - Added Russian (thanks to GrayPix and Kanspirians!);
  - Added French (thanks to Derrias!);
  - Added Japanese (thanks to FEMT1915!).

## 0.2.3
1.16.3+
- Re-implemented world generation to the new .json system:
  - Configs for wild patches have been changed, and are using new defaults;
  - Beach wild patches (Wild Cabbage and Sea Beet) now use a different weight pattern, so values are similar to other crops;
  - These two should change themselves on all instances, but we advise all players and modpack makers to reset their configs once, if migrating.
  
1.15.2+
- Adds Compost Heaps to village generation
  - These structures house heaps of Organic Compost, which farmers lay down to decompose into Rich Soil. Each biome has a different composting strategy based on their biome and climate!
  - Some of them have small farms mixed in, or examples of other mechanics;
  - They often have a few blocks of Rich Soil ready for taking!
- Adds 3 new meals: Cooked Rice, Grilled Salmon and Baked Cod Stew;
- Adds Tatami, a traditional flooring based on straw and canvas:
  - Tatami Blocks place as a "half-mat" by default. Placing another tatami against them will complete a "full-mat" pair! You can sneak-place to suppress pairing;
  - Tatami Mats are carpet-thin, come in Full and Half, and can be interchanged to and fro via crafting. They have a simpler placement and behave like carpets.
  - Thanks to Vazkii for sharing some placement code with me! A similar block to Tatami should soon be in Quark as well!
- Rename my "unofficial" Forge tool tags to be fully plural;
- Improves configs and integration options for modpack makers
- Prettifies the mod's meta files, and the info on the Mods page of Minecraft
- Makes Wild Patches non-replaceable like Tall Grass, closes issue #70
- Fixes containers vanishing if used to right-click an empty pot, closes issue #71
- Removes knives from being a crafting ingredient, delegating it to the Cutting Board if needed
  - Fixes Grindstone repairing for knives, and some duplication cases with other mods
- More extensions to IE and MCAbnormals integration;
- Straw harvesting now checks "farmersdelight:straw_harvesters" for items that can harvest straw from grassy plants.

## 0.2.2
1.16.1+
- Added Crimson and Warped Pantries;
- Added Netherite tools to tags, so they can be used on cutting boards.
1.15.2+
- Fix server crash when crafting any recipes using knives;
- Fix server crash when trying to load knife enchantments;
- (Grimmauld) Fix shears' default dispenser behaviour being overriden, and enhances behaviour compatibilities overall;
- Cooking Pot can now throw containers high enough to enter a hopper to its side;
- Add more compostables;
- Add several new salvaging recipes using the Cutting Board;
- Cabbage can now be portioned into 2 Cabbage Leaves for efficiency;
- Fixes Rich Soil Farmland decaying into normal Dirt if not hydrated;
- Adds up license definition in mods.toml;
- Mod Integrations, Volume 1:
    - Botany Pots: crops and soils;
    - Immersive Engineering: Garden Cloche integration;
    - MCAbnormals: meals for the Cooking Pot;
    - Create: milling and mixing for some items.

## 0.2.1
1.16.1+
- Netherite Knife added to knife tags;
- Added Soul Fire to tray_heat_sources.
1.15.2+
- Add the ability to smelt metal Knives for nuggets;
- Fix Wild Crops occasionally spawning themselves as items spontaneously;
- Fix drinking animation for Milk Bottle and Hot Cocoa on third person.

## 0.2.0 - Please Read!
1.16.1+
- Added Netherite Knife;
- Added Nether Salad;
1.15.2+
- Mulch has been renamed and remapped to Rich Soil - a more sensible name for its function.
  - BACKUP YOUR WORLDS!! The mod will try to remap existing mulch, so you won't lose your progress.
  - Some errors from other mods on world load might interrupt the remapping. If anything wrong happens, address the errors and try again with a backup.
  - Treat this as a breaking change. While existing mulch will usually be remapped safely, it's better to start a new world if you're not sure.
- Adds the Cutting Board - a hard surface to split items apart using certain tools
  - Tool items can be carved into the board for display by sneak-right-clicking;
  - Knives can portion meats and some fruits, to be more efficient when cooking meals;
  - Pickaxes can separate brick blocks back into individual bricks;
  - Axes can strip logs and harvest the removed tree bark, useful for composting;
    - With this change, Knives are no longer able to strip logs for bark;
  - Shears can salvage Saddles. Maybe more later!
  - Current recipes are proofs of concept; we plan to add more in the future!
- Adds Pantries - decorative storage blocks for every wood type;
- Adds Pies - placeable desserts made from often overlooked sweet ingredients!
  - Apple Pie, Sweet Berry Cheesecake and Chocolate Pie;
  - They have 4 slices, can be eaten by hand, or sliced off with Knives;
  - All pies provide a brief boost in Speed;
  - Pumpkin Pie compatibility planned for the future.
- Pumpkins can now be cut into 4 edible slices, to contrast with a Melon's 9 slices;
- Several tagging changes, both mod-scope and Forge-scope, to allow more customization;
- Many blocks in Farmer's Delight now send comparator signals;
- Flammable blocks and items are now fuels!
- New food effect: Comfort
  - Makes the user immune to cold and sickness (Hunger, Slowness and Weakness), and instantly heals these effects when obtained;
  - Provided by soups and stews, which are traditionally warm and wintry foods;
- Small tweaks to Tomato crop harvesting;
- Adds a few strong effects to vanilla soup items, to make them more interesting to consume;
- Wild Crops can now be multiplied by bone-mealing, at a small chance of success;
- General asset improvements.

## 0.1.5
- Cooking Pot now allows optional container overrides at recipe .json level:
  - Stuffed Pumpkin now uses that to have Pumpkins as containers;
  - All vanilla bowl foods now use it to have bowls as containers (they have no container in code);
  - Foods without containers in code or in .json just drop to output (e.g. Dumplings);
- Spent some time "sharpening" the Knives:
  - Fixed duplication bug when repairing them;
  - Knives are now able to receive a selection of weapon and tool enchantments;
  - Knives are now effective tools for cloth, cake and some plant materials;
  - Knives now have an exclusive enchantment: Backstabbing!
    - Multiplies damage when striking a mob from behind: 1.4x, 1.8x and 2.2x at levels I, II and III respectively;
  - Knives now lose only 1 durability point when striking mobs;
- Stove now has a cozy flame animation;
- Fixed Sea Beets dropping an unfarmable Beetroot instead of their seeds.

## 0.1.4a
- Fixes Crates lacking hardness and loot tables. Woops!

## 0.1.4
- Several fixes to the Cooking Pot:
  - It can now be automated: top side receives ingredients, sides can add containers and remove servings;
  - General performance fixes
  - Placeholder icon disappears if slot is filled
  - Better management of recipes and items
  - Now emits bubbling sounds! :D
- Added new foods and meals to make;
- Added Hot Cocoa, which removes 1 random negative effect when drinked;
- Farmer Villagers now buy the mod's basic crops (configurable);
- Bees will now seek wild crops, and can enter Love Mode with them;
- Added Crates for the basic crops, and reworked the Rice Bale
- Eating hearty meals now gives you the Nourished buff:
  - Constantly removes exhaustion unless you're spending saturation to heal damage;
- Mixed Salad now gives a short burst of Regeneration

## 0.1.3
- Adds Organic Compost, a nice sink for all these monster drops you have:
  - Organic Compost, when placed, will slowly decompose to Mulch over time;
  - Does so quicker if away from light, and close to mushrooms;
- Adds Mulch, a fertile soil. Can be tilled, cannot be trampled, and boosts crops planted on it;
  - Mushrooms planted on Mulch will begin growing Colonies of up to 5 mushrooms in the same spot;
- Rice now drops Rice Panicles if harvested without a knife. They can be crafted alone to get Rice;
- Adds Rice Bales to mass-store panicles;
- Knives can now strip logs to obtain Tree Bark, but will spend twice the durability to do so;
- Fixed a few bugs with the Stove;
- Fixed multiple bugs with the Cooking Pot;
- Added some utility recipes.

## 0.1.2
- Adds some Forge Tags to multiple items, so you can interchange with other food mods;
- Crafting and cooking recipes from this mod now use tags for most items as well;
- Minor fixes.

## 0.1.1
- Fixes conflict with other mods upon injecting chest loot tables;
- Returns Canvas to a 2x2 recipe instead of 3x3;
- Add basic tags to FD crops, seeds and milk.

## 0.1.0
- Initial release
- Adds the Stove - Upgraded, retrievable Campfire with six cooking slots;
- Adds the Cooking Pot - Portable workstation for preparing and mass-storing container foods (meals);
- Adds the Basket - Barrel that catches items landing on its open face, and can face any direction;
- Adds Knives - scavenging and cooking tools for retrieving more loot from plants and animals;
    - Knives can cut Cake into Slices of Cake - 1 for each remaining bite;
    - Slices of Cake can be crafted back into a Cake;
- Adds 4 new crops: Cabbage, Tomato, Onion and Rice;
- Generates Wild Patches for added crops and vanilla crops, spawning across the world on occasion;
- Adds multiple new foods to prepare using vanilla and Farmer's Delight ingredients;
- Adds Straw - a building material with a few current uses, and future ones planned;
- Adds Ropes - non-solid, deployable ladder blocks;
- Adds Safety Net - negates fall damage and bounces entities slightly;
- Adds JEI integration.
