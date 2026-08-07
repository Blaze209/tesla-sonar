package expo.modules.kotlin.types;

import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\" \u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"namedColors", "", "", "", "", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ColorTypeConverterKt {
    private static final Map<String, List<Float>> namedColors;

    static {
        Integer numValueOf = Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        Pair pairA = x.a("aliceblue", new Integer[]{numValueOf, Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE), 255, 255});
        Integer numValueOf2 = Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
        Pair pairA2 = x.a("antiquewhite", new Integer[]{numValueOf2, Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE), Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE), 255});
        Pair pairA3 = x.a("aqua", new Integer[]{0, 255, 255, 255});
        Pair pairA4 = x.a("aquamarine", new Integer[]{127, 255, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_OVERRIDE_VALUE), 255});
        Pair pairA5 = x.a("azure", new Integer[]{numValueOf, 255, 255, 255});
        Integer numValueOf3 = Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);
        Integer numValueOf4 = Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
        Pair pairA6 = x.a("beige", new Integer[]{numValueOf3, numValueOf3, numValueOf4, 255});
        Pair pairA7 = x.a("bisque", new Integer[]{255, Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), 196, 255});
        Pair pairA8 = x.a("black", new Integer[]{0, 0, 0, 255});
        Integer numValueOf5 = Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
        Integer numValueOf6 = Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_CLIPBOARD_VALUE);
        Pair pairA9 = x.a("blanchedalmond", new Integer[]{255, numValueOf5, numValueOf6, 255});
        Pair pairA10 = x.a("blue", new Integer[]{0, 0, 255, 255});
        Pair pairA11 = x.a("blueviolet", new Integer[]{138, 43, Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE), 255});
        Pair pairA12 = x.a("brown", new Integer[]{165, 42, 42, 255});
        Pair pairA13 = x.a("burlywood", new Integer[]{Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_SUBTRACT_VALUE), 184, 135, 255});
        Pair pairA14 = x.a("cadetblue", new Integer[]{95, 158, 160, 255});
        Pair pairA15 = x.a("chartreuse", new Integer[]{127, 255, 0, 255});
        Pair pairA16 = x.a("chocolate", new Integer[]{Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE), 105, 30, 255});
        Pair pairA17 = x.a("coral", new Integer[]{255, 127, 80, 255});
        Pair pairA18 = x.a("cornflowerblue", new Integer[]{100, 149, Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE), 255});
        Pair pairA19 = x.a("cornsilk", new Integer[]{255, Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE), numValueOf4, 255});
        Pair pairA20 = x.a("crimson", new Integer[]{numValueOf4, 20, 60, 255});
        Pair pairA21 = x.a("cyan", new Integer[]{0, 255, 255, 255});
        Pair pairA22 = x.a("darkblue", new Integer[]{0, 0, 139, 255});
        Pair pairA23 = x.a("darkcyan", new Integer[]{0, 139, 139, 255});
        Pair pairA24 = x.a("darkgoldenrod", new Integer[]{184, 134, 11, 255});
        Pair pairA25 = x.a("darkgray", new Integer[]{169, 169, 169, 255});
        Pair pairA26 = x.a("darkgreen", new Integer[]{0, 100, 0, 255});
        Pair pairA27 = x.a("darkgrey", new Integer[]{169, 169, 169, 255});
        Pair pairA28 = x.a("darkkhaki", new Integer[]{189, 183, 107, 255});
        Pair pairA29 = x.a("darkmagenta", new Integer[]{139, 0, 139, 255});
        Pair pairA30 = x.a("darkolivegreen", new Integer[]{85, 107, 47, 255});
        Pair pairA31 = x.a("darkorange", new Integer[]{255, 140, 0, 255});
        Pair pairA32 = x.a("darkorchid", new Integer[]{153, 50, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE), 255});
        Pair pairA33 = x.a("darkred", new Integer[]{139, 0, 0, 255});
        Pair pairA34 = x.a("darksalmon", new Integer[]{Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE), 150, 122, 255});
        Pair pairA35 = x.a("darkseagreen", new Integer[]{143, 188, 143, 255});
        Pair pairA36 = x.a("darkslateblue", new Integer[]{72, 61, 139, 255});
        Pair pairA37 = x.a("darkslategray", new Integer[]{47, 79, 79, 255});
        Pair pairA38 = x.a("darkslategrey", new Integer[]{47, 79, 79, 255});
        Pair pairA39 = x.a("darkturquoise", new Integer[]{0, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_CLOCK_VALUE), Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_INCOMPLETE_VALUE), 255});
        Pair pairA40 = x.a("darkviolet", new Integer[]{148, 0, 211, 255});
        Pair pairA41 = x.a("deeppink", new Integer[]{255, 20, 147, 255});
        Pair pairA42 = x.a("deepskyblue", new Integer[]{0, 191, 255, 255});
        Pair pairA43 = x.a("dimgray", new Integer[]{105, 105, 105, 255});
        Pair pairA44 = x.a("dimgrey", new Integer[]{105, 105, 105, 255});
        Pair pairA45 = x.a("dodgerblue", new Integer[]{30, 144, 255, 255});
        Pair pairA46 = x.a("firebrick", new Integer[]{178, 34, 34, 255});
        Pair pairA47 = x.a("floralwhite", new Integer[]{255, numValueOf2, numValueOf, 255});
        Pair pairA48 = x.a("forestgreen", new Integer[]{34, 139, 34, 255});
        Pair pairA49 = x.a("fuchsia", new Integer[]{255, 0, 255, 255});
        Pair pairA50 = x.a("gainsboro", new Integer[]{numValueOf4, numValueOf4, numValueOf4, 255});
        Pair pairA51 = x.a("ghostwhite", new Integer[]{Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE), Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE), 255, 255});
        Pair pairA52 = x.a("gold", new Integer[]{255, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE), 0, 255});
        Pair pairA53 = x.a("goldenrod", new Integer[]{Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_QUESTION_VALUE), 165, 32, 255});
        Pair pairA54 = x.a("gray", new Integer[]{128, 128, 128, 255});
        Pair pairA55 = x.a("green", new Integer[]{0, 128, 0, 255});
        Pair pairA56 = x.a("greenyellow", new Integer[]{173, 255, 47, 255});
        Pair pairA57 = x.a("grey", new Integer[]{128, 128, 128, 255});
        Pair pairA58 = x.a("honeydew", new Integer[]{numValueOf, 255, numValueOf, 255});
        Pair pairA59 = x.a("hotpink", new Integer[]{255, 105, 180, 255});
        Pair pairA60 = x.a("indianred", new Integer[]{numValueOf6, 92, 92, 255});
        Pair pairA61 = x.a("indigo", new Integer[]{75, 0, Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE), 255});
        Pair pairA62 = x.a("ivory", new Integer[]{255, 255, numValueOf, 255});
        Integer numValueOf7 = Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
        Pair pairA63 = x.a("khaki", new Integer[]{numValueOf, numValueOf7, 140, 255});
        Pair pairA64 = x.a("lavender", new Integer[]{numValueOf7, numValueOf7, numValueOf2, 255});
        Pair pairA65 = x.a("lavenderblush", new Integer[]{255, numValueOf, numValueOf3, 255});
        Pair pairA66 = x.a("lawngreen", new Integer[]{124, Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE), 0, 255});
        Pair pairA67 = x.a("lemonchiffon", new Integer[]{255, numValueOf2, numValueOf6, 255});
        Pair pairA68 = x.a("lightblue", new Integer[]{173, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE), numValueOf7, 255});
        Pair pairA69 = x.a("lightcoral", new Integer[]{numValueOf, 128, 128, 255});
        Pair pairA70 = x.a("lightcyan", new Integer[]{224, 255, 255, 255});
        Pair pairA71 = x.a("lightgoldenrodyellow", new Integer[]{numValueOf2, numValueOf2, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE), 255});
        Pair pairA72 = x.a("lightgray", new Integer[]{211, 211, 211, 255});
        Integer numValueOf8 = Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE);
        Map mapM = v0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, pairA15, pairA16, pairA17, pairA18, pairA19, pairA20, pairA21, pairA22, pairA23, pairA24, pairA25, pairA26, pairA27, pairA28, pairA29, pairA30, pairA31, pairA32, pairA33, pairA34, pairA35, pairA36, pairA37, pairA38, pairA39, pairA40, pairA41, pairA42, pairA43, pairA44, pairA45, pairA46, pairA47, pairA48, pairA49, pairA50, pairA51, pairA52, pairA53, pairA54, pairA55, pairA56, pairA57, pairA58, pairA59, pairA60, pairA61, pairA62, pairA63, pairA64, pairA65, pairA66, pairA67, pairA68, pairA69, pairA70, pairA71, pairA72, x.a("lightgreen", new Integer[]{144, numValueOf8, 144, 255}), x.a("lightgrey", new Integer[]{211, 211, 211, 255}), x.a("lightpink", new Integer[]{255, 182, 193, 255}), x.a("lightsalmon", new Integer[]{255, 160, 122, 255}), x.a("lightseagreen", new Integer[]{32, 178, 170, 255}), x.a("lightskyblue", new Integer[]{135, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_CLOCK_VALUE), numValueOf2, 255}), x.a("lightslategray", new Integer[]{119, 136, 153, 255}), x.a("lightslategrey", new Integer[]{119, 136, 153, 255}), x.a("lightsteelblue", new Integer[]{176, 196, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_SUBTRACT_VALUE), 255}), x.a("lightyellow", new Integer[]{255, 255, 224, 255}), x.a("lime", new Integer[]{0, 255, 0, 255}), x.a("limegreen", new Integer[]{50, numValueOf6, 50, 255}), x.a("linen", new Integer[]{numValueOf2, numValueOf, numValueOf7, 255}), x.a("magenta", new Integer[]{255, 0, 255, 255}), x.a("maroon", new Integer[]{128, 0, 0, 255}), x.a("mediumaquamarine", new Integer[]{102, numValueOf6, 170, 255}), x.a("mediumblue", new Integer[]{0, 0, numValueOf6, 255}), x.a("mediumorchid", new Integer[]{186, 85, 211, 255}), x.a("mediumpurple", new Integer[]{147, 112, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_REJECTED_REC_VALUE), 255}), x.a("mediumseagreen", new Integer[]{60, 179, 113, 255}), x.a("mediumslateblue", new Integer[]{123, 104, numValueOf8, 255}), x.a("mediumspringgreen", new Integer[]{0, numValueOf2, 154, 255}), x.a("mediumturquoise", new Integer[]{72, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_INCOMPLETE_VALUE), Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE), 255}), x.a("mediumvioletred", new Integer[]{Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_CANCEL_VALUE), 21, 133, 255}), x.a("midnightblue", new Integer[]{25, 25, 112, 255}), x.a("mintcream", new Integer[]{numValueOf3, 255, numValueOf2, 255}), x.a("mistyrose", new Integer[]{255, Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE), 255}), x.a("moccasin", new Integer[]{255, Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), 181, 255}), x.a("navajowhite", new Integer[]{255, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_SUBTRACT_VALUE), 173, 255}), x.a("navy", new Integer[]{0, 0, 128, 255}), x.a("oldlace", new Integer[]{Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE), numValueOf3, numValueOf7, 255}), x.a("olive", new Integer[]{128, 128, 0, 255}), x.a("olivedrab", new Integer[]{107, 142, 35, 255}), x.a("orange", new Integer[]{255, 165, 0, 255}), x.a("orangered", new Integer[]{255, 69, 0, 255}), x.a("orchid", new Integer[]{Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_QUESTION_VALUE), 112, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_PIN_VALUE), 255}), x.a("palegoldenrod", new Integer[]{numValueOf8, Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE), 170, 255}), x.a("palegreen", new Integer[]{152, Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE), 152, 255}), x.a("paleturquoise", new Integer[]{175, numValueOf8, numValueOf8, 255}), x.a("palevioletred", new Integer[]{Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_REJECTED_REC_VALUE), 112, 147, 255}), x.a("papayawhip", new Integer[]{255, Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE), Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_PAUSE_VALUE), 255}), x.a("peachpuff", new Integer[]{255, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_QUESTION_VALUE), 185, 255}), x.a("peru", new Integer[]{numValueOf6, 133, 63, 255}), x.a("pink", new Integer[]{255, 192, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE), 255}), x.a("plum", new Integer[]{Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_SUBMIT_VALUE), 160, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_SUBMIT_VALUE), 255}), x.a("powderblue", new Integer[]{176, 224, numValueOf7, 255}), x.a("purple", new Integer[]{128, 0, 128, 255}), x.a("rebeccapurple", new Integer[]{102, 51, 153, 255}), x.a("red", new Integer[]{255, 0, 0, 255}), x.a("rosybrown", new Integer[]{188, 143, 143, 255}), x.a("royalblue", new Integer[]{65, 105, Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE), 255}), x.a("saddlebrown", new Integer[]{139, 69, 19, 255}), x.a("salmon", new Integer[]{numValueOf2, 128, 114, 255}), x.a("sandybrown", new Integer[]{Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE), 164, 96, 255}), x.a("seagreen", new Integer[]{46, 139, 87, 255}), x.a("seashell", new Integer[]{255, numValueOf3, numValueOf8, 255}), x.a("sienna", new Integer[]{160, 82, 45, 255}), x.a("silver", new Integer[]{192, 192, 192, 255}), x.a("skyblue", new Integer[]{135, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_CLOCK_VALUE), Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE), 255}), x.a("slateblue", new Integer[]{106, 90, numValueOf6, 255}), x.a("slategray", new Integer[]{112, 128, 144, 255}), x.a("slategrey", new Integer[]{112, 128, 144, 255}), x.a("snow", new Integer[]{255, numValueOf2, numValueOf2, 255}), x.a("springgreen", new Integer[]{0, 255, 127, 255}), x.a("steelblue", new Integer[]{70, Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE), 180, 255}), x.a("tan", new Integer[]{Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE), 180, 140, 255}), x.a("teal", new Integer[]{0, 128, 128, 255}), x.a("thistle", new Integer[]{Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE), 191, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE), 255}), x.a("tomato", new Integer[]{255, 99, 71, 255}), x.a("transparent", new Integer[]{0, 0, 0, 0}), x.a("turquoise", new Integer[]{64, 224, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE), 255}), x.a("violet", new Integer[]{numValueOf8, Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE), numValueOf8, 255}), x.a("wheat", new Integer[]{numValueOf3, Integer.valueOf(EnumC4419g.SDK_ASSET_ICON_SUBTRACT_VALUE), 179, 255}), x.a("white", new Integer[]{255, 255, 255, 255}), x.a("whitesmoke", new Integer[]{numValueOf3, numValueOf3, numValueOf3, 255}), x.a("yellow", new Integer[]{255, 255, 0, 255}), x.a("yellowgreen", new Integer[]{154, numValueOf6, 50, 255}));
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(mapM.size()));
        for (Map.Entry entry : mapM.entrySet()) {
            Object key = entry.getKey();
            Integer[] numArr = (Integer[]) entry.getValue();
            ArrayList arrayList = new ArrayList(numArr.length);
            for (Integer num : numArr) {
                arrayList.add(Float.valueOf(num.intValue() / 255.0f));
            }
            linkedHashMap.put(key, arrayList);
        }
        namedColors = linkedHashMap;
    }
}
