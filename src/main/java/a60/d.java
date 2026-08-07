package a60;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"La60/d;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue$payments_core_release", "()I", "Production", "Test", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum d {
    Production(1),
    Test(3);

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private final int value;

    d(int i11) {
        this.value = i11;
    }

    public static EnumEntries<d> getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: renamed from: getValue$payments_core_release, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
