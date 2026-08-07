package me0;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lme0/b;", "", "<init>", "(Ljava/lang/String;I)V", "", "getExecutionLabel", "()I", "EXECUTING", "SUCCESS", "FAIL", "NONE", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum b {
    EXECUTING,
    SUCCESS,
    FAIL,
    NONE;

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91850a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.EXECUTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.FAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f91850a = iArr;
        }
    }

    public static EnumEntries<b> getEntries() {
        return $ENTRIES;
    }

    public final int getExecutionLabel() {
        int i11 = a.f91850a[ordinal()];
        if (i11 == 1) {
            return bc0.a.Z0;
        }
        if (i11 == 2) {
            return bc0.a.f16970b1;
        }
        if (i11 == 3) {
            return bc0.a.f16967a1;
        }
        if (i11 == 4) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
