package so;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00192\u0006\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u0004\u0018\u00010\u00122\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020(2\u0006\u0010\r\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0012¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010.R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00100¨\u00061"}, d2 = {"Lso/m;", "", "Lcom/facebook/react/bridge/ReadableMap;", "directionMap", "Lcom/facebook/react/bridge/ReadableArray;", "colorStopsArray", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableArray;Landroid/content/Context;)V", "Lso/m$a$c;", "keyword", "", Snapshot.WIDTH, Snapshot.HEIGHT, "b", "(Lso/m$a$c;DD)D", "angle", "", "Lkotlin/Pair;", "", "a", "(DFF)Lkotlin/Pair;", "Ljava/util/ArrayList;", "Lso/i;", "Lkotlin/collections/ArrayList;", "colorStops", "gradientLineLength", "", "Lso/q;", "c", "(Ljava/util/ArrayList;F)[Lso/q;", "originalStops", "", "e", "([Lso/q;)Ljava/util/List;", "Lcom/facebook/react/uimanager/o;", "position", "f", "(Lcom/facebook/react/uimanager/o;F)Ljava/lang/Float;", "Landroid/graphics/Shader;", DateTokenConverter.CONVERTER_KEY, "(FF)Landroid/graphics/Shader;", "Lcom/facebook/react/bridge/ReadableArray;", "Landroid/content/Context;", "Lso/m$a;", "Lso/m$a;", "direction", "Ljava/util/ArrayList;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReadableArray colorStopsArray;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a direction;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<ColorStop> colorStops;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lso/m$a;", "", "<init>", "()V", "a", "c", "b", "Lso/m$a$a;", "Lso/m$a$b;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static abstract class a {

        /* JADX INFO: renamed from: so.m$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lso/m$a$a;", "Lso/m$a;", "", "value", "<init>", "(D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Angle extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final double value;

            public Angle(double d11) {
                super(null);
                this.value = d11;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getValue() {
                return this.value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Angle) && Double.compare(this.value, ((Angle) other).value) == 0;
            }

            public int hashCode() {
                return Double.hashCode(this.value);
            }

            public String toString() {
                return "Angle(value=" + this.value + ")";
            }
        }

        /* JADX INFO: renamed from: so.m$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lso/m$a$b;", "Lso/m$a;", "Lso/m$a$c;", "value", "<init>", "(Lso/m$a$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lso/m$a$c;", "()Lso/m$a$c;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Keyword extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final c value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Keyword(c value) {
                super(null);
                s.k(value, "value");
                this.value = value;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final c getValue() {
                return this.value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Keyword) && this.value == ((Keyword) other).value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Keyword(value=" + this.value + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lso/m$a$c;", "", "<init>", "(Ljava/lang/String;I)V", "TO_TOP_RIGHT", "TO_BOTTOM_RIGHT", "TO_TOP_LEFT", "TO_BOTTOM_LEFT", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public enum c {
            TO_TOP_RIGHT,
            TO_BOTTOM_RIGHT,
            TO_TOP_LEFT,
            TO_BOTTOM_LEFT;

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            public static EnumEntries<c> getEntries() {
                return $ENTRIES;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f111528b;

        static {
            int[] iArr = new int[a.c.values().length];
            try {
                iArr[a.c.TO_TOP_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.c.TO_BOTTOM_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.c.TO_TOP_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.c.TO_BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f111527a = iArr;
            int[] iArr2 = new int[com.facebook.react.uimanager.p.values().length];
            try {
                iArr2[com.facebook.react.uimanager.p.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.facebook.react.uimanager.p.PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f111528b = iArr2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public m(ReadableMap directionMap, ReadableArray colorStopsArray, Context context) {
        a.c cVar;
        a keyword;
        s.k(directionMap, "directionMap");
        s.k(colorStopsArray, "colorStopsArray");
        s.k(context, "context");
        this.colorStopsArray = colorStopsArray;
        this.context = context;
        String string = directionMap.getString("type");
        if (!s.f(string, "angle")) {
            if (!s.f(string, "keyword")) {
                throw new IllegalArgumentException("Invalid direction type: " + string);
            }
            String string2 = directionMap.getString("value");
            if (string2 != null) {
                switch (string2.hashCode()) {
                    case -1849920841:
                        if (string2.equals("to bottom left")) {
                            cVar = a.c.TO_BOTTOM_LEFT;
                            keyword = new a.Keyword(cVar);
                        }
                        break;
                    case -1507310228:
                        if (string2.equals("to bottom right")) {
                            cVar = a.c.TO_BOTTOM_RIGHT;
                            keyword = new a.Keyword(cVar);
                        }
                        break;
                    case -1359525897:
                        if (string2.equals("to top left")) {
                            cVar = a.c.TO_TOP_LEFT;
                            keyword = new a.Keyword(cVar);
                        }
                        break;
                    case 810031148:
                        if (string2.equals("to top right")) {
                            cVar = a.c.TO_TOP_RIGHT;
                            keyword = new a.Keyword(cVar);
                        }
                        break;
                }
            }
            throw new IllegalArgumentException("Invalid linear gradient direction keyword: " + directionMap.getString("value"));
        }
        keyword = new a.Angle(directionMap.getDouble("value"));
        this.direction = keyword;
        ArrayList<ColorStop> arrayList = new ArrayList<>(colorStopsArray.size());
        int size = colorStopsArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            ReadableMap map = this.colorStopsArray.getMap(i11);
            if (map != null) {
                arrayList.add(new ColorStop((!map.hasKey("color") || map.isNull("color")) ? null : map.getType("color") == ReadableType.Map ? ColorPropConverter.getColor(map.getMap("color"), this.context) : Integer.valueOf(map.getInt("color")), LengthPercentage.INSTANCE.a(map.getDynamic("position"))));
            }
        }
        this.colorStops = arrayList;
    }

    private final Pair<float[], float[]> a(double angle, float height, float width) {
        float[] fArr;
        double d11 = 360;
        double d12 = angle % d11;
        if (d12 < 0.0d) {
            d12 += d11;
        }
        if (d12 == 0.0d) {
            return new Pair<>(new float[]{BitmapDescriptorFactory.HUE_RED, height}, new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED});
        }
        if (d12 == 90.0d) {
            return new Pair<>(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED}, new float[]{width, BitmapDescriptorFactory.HUE_RED});
        }
        if (d12 == 180.0d) {
            return new Pair<>(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED}, new float[]{BitmapDescriptorFactory.HUE_RED, height});
        }
        if (d12 == 270.0d) {
            return new Pair<>(new float[]{width, BitmapDescriptorFactory.HUE_RED}, new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED});
        }
        float fTan = (float) Math.tan(Math.toRadians(((double) 90) - d12));
        float f11 = (-1) / fTan;
        float f12 = 2;
        float f13 = height / f12;
        float f14 = width / f12;
        if (d12 < 90.0d) {
            fArr = new float[]{f14, f13};
        } else if (d12 < 180.0d) {
            fArr = new float[]{f14, -f13};
        } else {
            fArr = d12 < 270.0d ? new float[]{-f14, -f13} : new float[]{-f14, f13};
        }
        float f15 = fArr[1] - (fArr[0] * f11);
        float f16 = f15 / (fTan - f11);
        float f17 = (f11 * f16) + f15;
        return new Pair<>(new float[]{f14 - f16, f13 + f17}, new float[]{f14 + f16, f13 - f17});
    }

    private final double b(a.c keyword, double width, double height) {
        double degrees;
        double d11;
        int i11;
        int i12 = b.f111527a[keyword.ordinal()];
        if (i12 == 1) {
            return ((double) 90) - Math.toDegrees(Math.atan(width / height));
        }
        if (i12 != 2) {
            if (i12 == 3) {
                degrees = Math.toDegrees(Math.atan(width / height));
                i11 = EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
            } else {
                if (i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                degrees = Math.toDegrees(Math.atan(height / width));
                i11 = 180;
            }
            d11 = i11;
        } else {
            degrees = Math.toDegrees(Math.atan(width / height));
            d11 = 90;
        }
        return degrees + d11;
    }

    private final ProcessedColorStop[] c(ArrayList<ColorStop> colorStops, float gradientLineLength) {
        Float position;
        int size = colorStops.size();
        ProcessedColorStop[] processedColorStopArr = new ProcessedColorStop[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            processedColorStopArr[i12] = new ProcessedColorStop(null, null, 3, null);
        }
        Float f11 = f(colorStops.get(0).getPosition(), gradientLineLength);
        float fFloatValue = f11 != null ? f11.floatValue() : 0.0f;
        int size2 = colorStops.size();
        int i13 = 0;
        boolean z11 = false;
        while (i13 < size2) {
            ColorStop colorStop = colorStops.get(i13);
            s.j(colorStop, "get(...)");
            ColorStop colorStop2 = colorStop;
            Float f12 = f(colorStop2.getPosition(), gradientLineLength);
            if (f12 == null) {
                f12 = i13 == 0 ? Float.valueOf(BitmapDescriptorFactory.HUE_RED) : i13 == colorStops.size() - 1 ? Float.valueOf(1.0f) : null;
            }
            if (f12 != null) {
                fFloatValue = Math.max(f12.floatValue(), fFloatValue);
                processedColorStopArr[i13] = new ProcessedColorStop(colorStop2.getColor(), Float.valueOf(fFloatValue));
            } else {
                z11 = true;
            }
            i13++;
        }
        if (z11) {
            for (int i14 = 1; i14 < size; i14++) {
                Float position2 = processedColorStopArr[i14].getPosition();
                if (position2 != null) {
                    int i15 = i14 - i11;
                    int i16 = i15 - 1;
                    if (i16 > 0 && (position = processedColorStopArr[i11].getPosition()) != null) {
                        float fFloatValue2 = (position2.floatValue() - position.floatValue()) / i15;
                        if (1 <= i16) {
                            int i17 = 1;
                            while (true) {
                                int i18 = i11 + i17;
                                processedColorStopArr[i18] = new ProcessedColorStop(colorStops.get(i18).getColor(), Float.valueOf(position.floatValue() + (i17 * fFloatValue2)));
                                if (i17 == i16) {
                                    break;
                                }
                                i17++;
                            }
                        }
                    }
                    i11 = i14;
                }
            }
        }
        return processedColorStopArr;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007e A[PHI: r6
      0x007e: PHI (r6v2 int) = (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v5 int) binds: [B:5:0x0013, B:8:0x0018, B:11:0x003d, B:12:0x003f, B:13:0x0041, B:24:0x0099, B:21:0x0089, B:17:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    private final List<ProcessedColorStop> e(ProcessedColorStop[] originalStops) {
        int i11;
        int i12;
        ProcessedColorStop[] processedColorStopArr = originalStops;
        List<ProcessedColorStop> listF1 = p013kotlin.collections.n.F1(processedColorStopArr);
        int i13 = 1;
        int length = processedColorStopArr.length - 1;
        int i14 = 1;
        int i15 = 0;
        while (i14 < length) {
            if (processedColorStopArr[i14].getColor() == null && (i12 = i14 + i15) >= i13) {
                int i16 = i12 - 1;
                Float position = listF1.get(i16).getPosition();
                int i17 = i12 + 1;
                Float position2 = listF1.get(i17).getPosition();
                Float position3 = listF1.get(i12).getPosition();
                if (position == null || position2 == null || position3 == null) {
                    i11 = length;
                } else {
                    float fFloatValue = position3.floatValue() - position.floatValue();
                    float fFloatValue2 = position2.floatValue() - position3.floatValue();
                    float fFloatValue3 = position2.floatValue() - position.floatValue();
                    Integer color = listF1.get(i16).getColor();
                    Integer color2 = listF1.get(i17).getColor();
                    if (com.facebook.react.uimanager.f.a(fFloatValue, fFloatValue2)) {
                        listF1.remove(i12);
                        i15--;
                    } else if (com.facebook.react.uimanager.f.a(fFloatValue, BitmapDescriptorFactory.HUE_RED)) {
                        listF1.get(i12).c(color2);
                    } else if (com.facebook.react.uimanager.f.a(fFloatValue2, BitmapDescriptorFactory.HUE_RED)) {
                        listF1.get(i12).c(color);
                    } else {
                        ArrayList arrayList = new ArrayList(9);
                        if (fFloatValue > fFloatValue2) {
                            int i18 = 0;
                            while (i18 < 7) {
                                arrayList.add(new ProcessedColorStop(null, Float.valueOf(position.floatValue() + (((i18 + 7.0f) / 13.0f) * fFloatValue))));
                                i18++;
                                length = length;
                            }
                            i11 = length;
                            arrayList.add(new ProcessedColorStop(null, Float.valueOf(position3.floatValue() + (0.33333334f * fFloatValue2))));
                            arrayList.add(new ProcessedColorStop(null, Float.valueOf(position3.floatValue() + (fFloatValue2 * 0.6666667f))));
                        } else {
                            i11 = length;
                            arrayList.add(new ProcessedColorStop(null, Float.valueOf(position.floatValue() + (0.33333334f * fFloatValue))));
                            arrayList.add(new ProcessedColorStop(null, Float.valueOf(position.floatValue() + (0.6666667f * fFloatValue))));
                            for (int i19 = 0; i19 < 7; i19++) {
                                arrayList.add(new ProcessedColorStop(null, Float.valueOf(position3.floatValue() + ((i19 / 13.0f) * fFloatValue2))));
                            }
                        }
                        double dLog = Math.log(0.5d) / ((double) ((float) Math.log(fFloatValue / fFloatValue3)));
                        Iterator it = arrayList.iterator();
                        s.j(it, "iterator(...)");
                        while (it.hasNext()) {
                            Object next = it.next();
                            s.j(next, "next(...)");
                            ProcessedColorStop processedColorStop = (ProcessedColorStop) next;
                            if (processedColorStop.getPosition() != null) {
                                float fPow = (float) Math.pow((processedColorStop.getPosition().floatValue() - position.floatValue()) / fFloatValue3, dLog);
                                if (!Float.isInfinite(fPow) && !Float.isNaN(fPow) && !Float.isNaN(fPow) && color != null) {
                                    int iIntValue = color.intValue();
                                    if (color2 != null) {
                                        processedColorStop.c(Integer.valueOf(k5.d.c(iIntValue, color2.intValue(), fPow)));
                                    }
                                }
                            }
                        }
                        listF1.remove(i12);
                        listF1.addAll(i12, arrayList);
                        i15 += 8;
                    }
                    i11 = length;
                }
            } else {
                i11 = length;
            }
            i14++;
            processedColorStopArr = originalStops;
            length = i11;
            i13 = 1;
        }
        return listF1;
    }

    private final Float f(LengthPercentage position, float gradientLineLength) {
        if (position == null) {
            return null;
        }
        int i11 = b.f111528b[position.getType().ordinal()];
        if (i11 == 1) {
            return Float.valueOf(w.h(position.b(BitmapDescriptorFactory.HUE_RED)) / gradientLineLength);
        }
        if (i11 == 2) {
            return Float.valueOf(position.b(1.0f));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Shader d(float width, float height) {
        m mVar;
        double dB;
        a aVar = this.direction;
        if (aVar instanceof a.Angle) {
            dB = ((a.Angle) aVar).getValue();
            mVar = this;
        } else {
            if (!(aVar instanceof a.Keyword)) {
                throw new NoWhenBranchMatchedException();
            }
            mVar = this;
            dB = mVar.b(((a.Keyword) aVar).getValue(), width, height);
        }
        Pair<float[], float[]> pairA = a(dB, height, width);
        float[] fArrA = pairA.a();
        float[] fArrB = pairA.b();
        float f11 = fArrB[0] - fArrA[0];
        float f12 = fArrB[1] - fArrA[1];
        List<ProcessedColorStop> listE = e(c(mVar.colorStops, (float) Math.sqrt((f11 * f11) + (f12 * f12))));
        int[] iArr = new int[listE.size()];
        float[] fArr = new float[listE.size()];
        int i11 = 0;
        for (Object obj : listE) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            ProcessedColorStop processedColorStop = (ProcessedColorStop) obj;
            Integer color = processedColorStop.getColor();
            if (color != null && processedColorStop.getPosition() != null) {
                iArr[i11] = color.intValue();
                fArr[i11] = processedColorStop.getPosition().floatValue();
            }
            i11 = i12;
        }
        return new LinearGradient(fArrA[0], fArrA[1], fArrB[0], fArrB[1], iArr, fArr, Shader.TileMode.CLAMP);
    }
}
