package com.facebook.react.uimanager;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Arrays;
import java.util.HashSet;
import kotlinx.coroutines.DebugKt;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0011j\b\u0012\u0004\u0012\u00020\u0006`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/uimanager/u1;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "map", "", "prop", "", "a", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z", "", "b", "[I", "BORDER_SPACING_TYPES", "c", "PADDING_MARGIN_SPACING_TYPES", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/HashSet;", "LAYOUT_ONLY_PROPS", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u1 f23401a = new u1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final int[] BORDER_SPACING_TYPES = {8, 4, 5, 1, 3, 0, 2};

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final int[] PADDING_MARGIN_SPACING_TYPES = {8, 7, 6, 4, 5, 1, 3, 0, 2};

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final HashSet<String> LAYOUT_ONLY_PROPS = new HashSet<>(Arrays.asList("alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "rowGap", "columnGap", "gap", "flexShrink", "flexWrap", "justifyContent", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", Snapshot.WIDTH, Snapshot.HEIGHT, "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd"));

    private u1() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final boolean a(ReadableMap map, String prop) {
        ReadableType type;
        p013kotlin.jvm.internal.s.k(map, "map");
        p013kotlin.jvm.internal.s.k(prop, "prop");
        if (LAYOUT_ONLY_PROPS.contains(prop)) {
            return true;
        }
        if (p013kotlin.jvm.internal.s.f("pointerEvents", prop)) {
            String string = map.getString(prop);
            return p013kotlin.jvm.internal.s.f(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, string) || p013kotlin.jvm.internal.s.f("box-none", string);
        }
        switch (prop.hashCode()) {
            case -1989576717:
                return prop.equals("borderRightColor") && map.getType("borderRightColor") == ReadableType.Number && map.getInt("borderRightColor") == 0;
            case -1971292586:
                if (prop.equals("borderRightWidth")) {
                    return map.isNull("borderRightWidth") || map.getDouble("borderRightWidth") == 0.0d;
                }
                return false;
            case -1470826662:
                return prop.equals("borderTopColor") && map.getType("borderTopColor") == ReadableType.Number && map.getInt("borderTopColor") == 0;
            case -1452542531:
                if (prop.equals("borderTopWidth")) {
                    return map.isNull("borderTopWidth") || map.getDouble("borderTopWidth") == 0.0d;
                }
                return false;
            case -1308858324:
                return prop.equals("borderBottomColor") && map.getType("borderBottomColor") == ReadableType.Number && map.getInt("borderBottomColor") == 0;
            case -1290574193:
                if (prop.equals("borderBottomWidth")) {
                    return map.isNull("borderBottomWidth") || map.getDouble("borderBottomWidth") == 0.0d;
                }
                return false;
            case -1267206133:
                if (prop.equals("opacity")) {
                    return map.isNull("opacity") || map.getDouble("opacity") == 1.0d;
                }
                return false;
            case -242276144:
                return prop.equals("borderLeftColor") && map.getType("borderLeftColor") == ReadableType.Number && map.getInt("borderLeftColor") == 0;
            case -223992013:
                if (prop.equals("borderLeftWidth")) {
                    return map.isNull("borderLeftWidth") || map.getDouble("borderLeftWidth") == 0.0d;
                }
                return false;
            case 306963138:
                return prop.equals("borderBlockStartColor") && map.getType("borderBlockStartColor") == ReadableType.Number && map.getInt("borderBlockStartColor") == 0;
            case 529642498:
                if (prop.equals("overflow")) {
                    return map.isNull("overflow") || p013kotlin.jvm.internal.s.f("visible", map.getString("overflow"));
                }
                return false;
            case 684610594:
                return prop.equals("borderBlockColor") && map.getType("borderBlockColor") == ReadableType.Number && map.getInt("borderBlockColor") == 0;
            case 741115130:
                if (prop.equals("borderWidth")) {
                    return map.isNull("borderWidth") || map.getDouble("borderWidth") == 0.0d;
                }
                return false;
            case 762983977:
                return prop.equals("borderBlockEndColor") && map.getType("borderBlockEndColor") == ReadableType.Number && map.getInt("borderBlockEndColor") == 0;
            case 1349188574:
                if (prop.equals(Snapshot.BORDER_RADIUS)) {
                    if (!map.hasKey("backgroundColor") || (((type = map.getType("backgroundColor")) != ReadableType.Number || map.getInt("backgroundColor") == 0) && type == ReadableType.Null)) {
                        return !map.hasKey("borderWidth") || map.isNull("borderWidth") || map.getDouble("borderWidth") == 0.0d;
                    }
                    return false;
                }
                return false;
            default:
                return false;
        }
    }
}
