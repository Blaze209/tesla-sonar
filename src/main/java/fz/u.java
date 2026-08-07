package fz;

import kotlinx.coroutines.DebugKt;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lfz/u;", "Lfz/h;", "", "", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getUnionValue", "()Ljava/lang/String;", "Companion", "a", "OFF", "ON", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum u implements h {
    OFF(DebugKt.DEBUG_PROPERTY_VALUE_OFF),
    ON(DebugKt.DEBUG_PROPERTY_VALUE_ON);

    private final String unionValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: fz.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfz/u$a;", "", "Lfz/u;", "<init>", "()V", "", "unionValue", "a", "(Ljava/lang/String;)Lfz/u;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public u a(String unionValue) {
            if (p013kotlin.jvm.internal.s.f(unionValue, DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                return u.OFF;
            }
            return p013kotlin.jvm.internal.s.f(unionValue, DebugKt.DEBUG_PROPERTY_VALUE_ON) ? u.ON : u.OFF;
        }

        private Companion() {
        }
    }

    u(String str) {
        this.unionValue = str;
    }

    public static EnumEntries<u> getEntries() {
        return $ENTRIES;
    }

    @Override // fz.h
    public String getUnionValue() {
        return this.unionValue;
    }
}
