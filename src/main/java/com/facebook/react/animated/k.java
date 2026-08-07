package com.facebook.react.animated;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 )2\u00020\u0001:\u0002*+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010$\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u0019¨\u0006,"}, d2 = {"Lcom/facebook/react/animated/k;", "Lcom/facebook/react/animated/w;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/animated/b;", "parent", "Ljn0/h0;", "c", "(Lcom/facebook/react/animated/b;)V", DateTokenConverter.CONVERTER_KEY, "h", "()V", "", "k", "()Ljava/lang/Object;", "", "e", "()Ljava/lang/String;", "", IntegerTokenConverter.CONVERTER_KEY, "[D", "inputRange", "j", "Ljava/lang/Object;", "outputRange", "Lcom/facebook/react/animated/k$b;", "Lcom/facebook/react/animated/k$b;", "outputType", "l", "Ljava/lang/String;", "pattern", "m", "extrapolateLeft", "n", "extrapolateRight", "o", "Lcom/facebook/react/animated/w;", "p", "objectValue", "q", "b", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends w {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f22226r;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final double[] inputRange;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Object outputRange;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private b outputType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private String pattern;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String extrapolateLeft;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String extrapolateRight;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private w parent;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Object objectValue;

    /* JADX INFO: renamed from: com.facebook.react.animated.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JI\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\"\u0010#JG\u0010%\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010(¨\u0006/"}, d2 = {"Lcom/facebook/react/animated/k$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableArray;", "array", "", "e", "(Lcom/facebook/react/bridge/ReadableArray;)[D", "", "f", "(Lcom/facebook/react/bridge/ReadableArray;)[I", "", "g", "(Lcom/facebook/react/bridge/ReadableArray;)[[D", "", "value", "ranges", "", DateTokenConverter.CONVERTER_KEY, "(D[D)I", "inputMin", "inputMax", "outputMin", "outputMax", "", "extrapolateLeft", "extrapolateRight", "h", "(DDDDDLjava/lang/String;Ljava/lang/String;)D", "inputRange", "outputRange", IntegerTokenConverter.CONVERTER_KEY, "(D[D[DLjava/lang/String;Ljava/lang/String;)D", "j", "(D[D[I)I", "pattern", "k", "(Ljava/lang/String;D[D[[DLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "EXTRAPOLATE_TYPE_IDENTITY", "Ljava/lang/String;", "EXTRAPOLATE_TYPE_CLAMP", "EXTRAPOLATE_TYPE_EXTEND", "Ljava/util/regex/Pattern;", "numericPattern", "Ljava/util/regex/Pattern;", "COLOR_OUTPUT_TYPE", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int d(double value, double[] ranges) {
            int i11 = 1;
            while (i11 < ranges.length - 1 && ranges[i11] < value) {
                i11++;
            }
            return i11 - 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final double[] e(ReadableArray array) {
            if (array == null) {
                return new double[0];
            }
            int size = array.size();
            double[] dArr = new double[size];
            for (int i11 = 0; i11 < size; i11++) {
                dArr[i11] = array.getDouble(i11);
            }
            return dArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int[] f(ReadableArray array) {
            if (array == null) {
                return new int[0];
            }
            int size = array.size();
            int[] iArr = new int[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = array.getInt(i11);
            }
            return iArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final double[][] g(ReadableArray array) {
            int size = array.size();
            double[][] dArr = new double[size][];
            Pattern pattern = k.f22226r;
            String string = array.getString(0);
            if (string == null) {
                string = "";
            }
            Matcher matcher = pattern.matcher(string);
            ArrayList arrayList = new ArrayList();
            while (matcher.find()) {
                String strGroup = matcher.group();
                p013kotlin.jvm.internal.s.j(strGroup, "group(...)");
                arrayList.add(Double.valueOf(Double.parseDouble(strGroup)));
            }
            int size2 = arrayList.size();
            double[] dArr2 = new double[size2];
            int size3 = arrayList.size();
            for (int i11 = 0; i11 < size3; i11++) {
                dArr2[i11] = ((Number) arrayList.get(i11)).doubleValue();
            }
            dArr[0] = dArr2;
            for (int i12 = 1; i12 < size; i12++) {
                double[] dArr3 = new double[size2];
                Pattern pattern2 = k.f22226r;
                String string2 = array.getString(i12);
                if (string2 == null) {
                    string2 = "";
                }
                Matcher matcher2 = pattern2.matcher(string2);
                for (int i13 = 0; matcher2.find() && i13 < size2; i13++) {
                    String strGroup2 = matcher2.group();
                    p013kotlin.jvm.internal.s.j(strGroup2, "group(...)");
                    dArr3[i13] = Double.parseDouble(strGroup2);
                }
                dArr[i12] = dArr3;
            }
            return dArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        
            if (r22.equals("extend") != false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        
            if (r23.equals("extend") != false) goto L38;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final double h(double r12, double r14, double r16, double r18, double r20, java.lang.String r22, java.lang.String r23) {
            /*
                r11 = this;
                r0 = r22
                r1 = r23
                int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                java.lang.String r3 = "Invalid extrapolation type "
                java.lang.String r4 = "extend"
                java.lang.String r5 = "identity"
                java.lang.String r6 = "clamp"
                r7 = 94742715(0x5a5a8bb, float:1.5578507E-35)
                r8 = -135761730(0xfffffffff7e870be, float:-9.428903E33)
                r9 = -1289044198(0xffffffffb32abf1a, float:-3.9755015E-8)
                if (r2 >= 0) goto L55
                if (r0 == 0) goto L3b
                int r10 = r0.hashCode()
                if (r10 == r9) goto L34
                if (r10 == r8) goto L2d
                if (r10 != r7) goto L3b
                boolean r12 = r0.equals(r6)
                if (r12 == 0) goto L3b
                r12 = r14
                goto L55
            L2d:
                boolean r1 = r0.equals(r5)
                if (r1 == 0) goto L3b
                return r12
            L34:
                boolean r10 = r0.equals(r4)
                if (r10 == 0) goto L3b
                goto L55
            L3b:
                com.facebook.react.bridge.JSApplicationIllegalArgumentException r12 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r3)
                r13.append(r0)
                java.lang.String r0 = "for left extrapolation"
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
            L55:
                int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
                if (r0 <= 0) goto L96
                if (r1 == 0) goto L7c
                int r0 = r1.hashCode()
                if (r0 == r9) goto L75
                if (r0 == r8) goto L6e
                if (r0 != r7) goto L7c
                boolean r12 = r1.equals(r6)
                if (r12 == 0) goto L7c
                r12 = r16
                goto L96
            L6e:
                boolean r0 = r1.equals(r5)
                if (r0 == 0) goto L7c
                return r12
            L75:
                boolean r0 = r1.equals(r4)
                if (r0 == 0) goto L7c
                goto L96
            L7c:
                com.facebook.react.bridge.JSApplicationIllegalArgumentException r12 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r3)
                r13.append(r1)
                java.lang.String r0 = "for right extrapolation"
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
            L96:
                int r0 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
                if (r0 != 0) goto L9b
                return r18
            L9b:
                int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r0 != 0) goto La3
                if (r2 > 0) goto La2
                return r18
            La2:
                return r20
            La3:
                double r0 = r20 - r18
                double r12 = r12 - r14
                double r0 = r0 * r12
                double r12 = r16 - r14
                double r0 = r0 / r12
                double r12 = r18 + r0
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.k.Companion.h(double, double, double, double, double, java.lang.String, java.lang.String):double");
        }

        public final double i(double value, double[] inputRange, double[] outputRange, String extrapolateLeft, String extrapolateRight) {
            p013kotlin.jvm.internal.s.k(inputRange, "inputRange");
            p013kotlin.jvm.internal.s.k(outputRange, "outputRange");
            int iD = d(value, inputRange);
            int i11 = iD + 1;
            return h(value, inputRange[iD], inputRange[i11], outputRange[iD], outputRange[i11], extrapolateLeft, extrapolateRight);
        }

        public final int j(double value, double[] inputRange, int[] outputRange) {
            p013kotlin.jvm.internal.s.k(inputRange, "inputRange");
            p013kotlin.jvm.internal.s.k(outputRange, "outputRange");
            int iD = d(value, inputRange);
            int i11 = outputRange[iD];
            int i12 = iD + 1;
            int i13 = outputRange[i12];
            if (i11 != i13) {
                double d11 = inputRange[iD];
                double d12 = inputRange[i12];
                if (d11 != d12) {
                    return k5.d.c(i11, i13, (float) ((value - d11) / (d12 - d11)));
                }
                if (value > d11) {
                    return i13;
                }
            }
            return i11;
        }

        public final String k(String pattern, double value, double[] inputRange, double[][] outputRange, String extrapolateLeft, String extrapolateRight) {
            double[] inputRange2 = inputRange;
            p013kotlin.jvm.internal.s.k(pattern, "pattern");
            p013kotlin.jvm.internal.s.k(inputRange2, "inputRange");
            p013kotlin.jvm.internal.s.k(outputRange, "outputRange");
            Companion companion = this;
            double d11 = value;
            int iD = companion.d(d11, inputRange2);
            StringBuffer stringBuffer = new StringBuffer(pattern.length());
            Matcher matcher = k.f22226r.matcher(pattern);
            int i11 = 0;
            while (matcher.find()) {
                double[] dArr = outputRange[iD];
                if (i11 >= dArr.length) {
                    break;
                }
                int i12 = iD + 1;
                StringBuffer stringBuffer2 = stringBuffer;
                int i13 = i11;
                double dH = companion.h(d11, inputRange2[iD], inputRange2[i12], dArr[i11], outputRange[i12][i11], extrapolateLeft, extrapolateRight);
                int i14 = (int) dH;
                matcher.appendReplacement(stringBuffer2, ((double) i14) == dH ? String.valueOf(i14) : String.valueOf(dH));
                i11 = i13 + 1;
                companion = this;
                d11 = value;
                stringBuffer = stringBuffer2;
                inputRange2 = inputRange;
            }
            StringBuffer stringBuffer3 = stringBuffer;
            matcher.appendTail(stringBuffer3);
            String string = stringBuffer3.toString();
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            return string;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/animated/k$b;", "", "<init>", "(Ljava/lang/String;I)V", "Number", "Color", "String", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private enum b {
        Number,
        Color,
        String;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22235a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Color.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22235a = iArr;
        }
    }

    static {
        Pattern patternCompile = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");
        p013kotlin.jvm.internal.s.j(patternCompile, "compile(...)");
        f22226r = patternCompile;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ReadableMap config) {
        super(null, 1, null);
        p013kotlin.jvm.internal.s.k(config, "config");
        Companion companion = INSTANCE;
        this.inputRange = companion.e(config.getArray("inputRange"));
        this.extrapolateLeft = config.getString("extrapolateLeft");
        this.extrapolateRight = config.getString("extrapolateRight");
        ReadableArray array = config.getArray("outputRange");
        if (p013kotlin.jvm.internal.s.f("color", config.getString("outputType"))) {
            this.outputType = b.Color;
            this.outputRange = companion.f(array);
            return;
        }
        if ((array != null ? array.getType(0) : null) != ReadableType.String) {
            this.outputType = b.Number;
            this.outputRange = companion.e(array);
        } else {
            this.outputType = b.String;
            this.outputRange = companion.g(array);
            this.pattern = array.getString(0);
        }
    }

    @Override // com.facebook.react.animated.b
    public void c(com.facebook.react.animated.b parent) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        if (this.parent != null) {
            throw new IllegalStateException("Parent already attached");
        }
        if (!(parent instanceof w)) {
            throw new IllegalArgumentException("Parent is of an invalid type");
        }
        this.parent = (w) parent;
    }

    @Override // com.facebook.react.animated.b
    public void d(com.facebook.react.animated.b parent) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        if (parent != this.parent) {
            throw new IllegalArgumentException("Invalid parent node provided");
        }
        this.parent = null;
    }

    @Override // com.facebook.react.animated.w, com.facebook.react.animated.b
    public String e() {
        return "InterpolationAnimatedNode[" + this.tag + "] super: {super.prettyPrint()}";
    }

    @Override // com.facebook.react.animated.b
    public void h() {
        String str;
        w wVar = this.parent;
        if (wVar != null) {
            double dL = wVar.l();
            b bVar = this.outputType;
            int i11 = bVar == null ? -1 : c.f22235a[bVar.ordinal()];
            if (i11 == 1) {
                Companion companion = INSTANCE;
                double[] dArr = this.inputRange;
                Object obj = this.outputRange;
                p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.DoubleArray");
                this.nodeValue = companion.i(dL, dArr, (double[]) obj, this.extrapolateLeft, this.extrapolateRight);
                return;
            }
            if (i11 == 2) {
                Companion companion2 = INSTANCE;
                double[] dArr2 = this.inputRange;
                Object obj2 = this.outputRange;
                p013kotlin.jvm.internal.s.i(obj2, "null cannot be cast to non-null type kotlin.IntArray");
                this.objectValue = Integer.valueOf(companion2.j(dL, dArr2, (int[]) obj2));
                return;
            }
            if (i11 == 3 && (str = this.pattern) != null) {
                Companion companion3 = INSTANCE;
                double[] dArr3 = this.inputRange;
                Object obj3 = this.outputRange;
                p013kotlin.jvm.internal.s.i(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.DoubleArray>");
                this.objectValue = companion3.k(str, dL, dArr3, (double[][]) obj3, this.extrapolateLeft, this.extrapolateRight);
            }
        }
    }

    @Override // com.facebook.react.animated.w
    /* JADX INFO: renamed from: k, reason: from getter */
    public Object getObjectValue() {
        return this.objectValue;
    }
}
