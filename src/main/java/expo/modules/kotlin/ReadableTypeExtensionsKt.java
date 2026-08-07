package expo.modules.kotlin;

import co0.q;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/bridge/ReadableType;", "Lco0/q;", "toKType", "(Lcom/facebook/react/bridge/ReadableType;)Lco0/q;", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ReadableTypeExtensionsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final q toKType(ReadableType readableType) {
        s.k(readableType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[readableType.ordinal()]) {
            case 1:
                return do0.d.c(o0.b(Object.class), null, true, null, 5, null);
            case 2:
                return do0.d.c(o0.b(Boolean.TYPE), null, false, null, 7, null);
            case 3:
                return do0.d.c(o0.b(Number.class), null, false, null, 7, null);
            case 4:
                return do0.d.c(o0.b(String.class), null, false, null, 7, null);
            case 5:
                return do0.d.c(o0.b(ReadableMap.class), null, false, null, 7, null);
            case 6:
                return do0.d.c(o0.b(ReadableArray.class), null, false, null, 7, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
