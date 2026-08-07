package kd0;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lnc0/e;", "", "a", "(Lnc0/e;)Ljava/lang/String;", "apiValue", "monitoring_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85938a;

        static {
            int[] iArr = new int[nc0.e.values().length];
            try {
                iArr[nc0.e.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[nc0.e.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[nc0.e.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[nc0.e.DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[nc0.e.HEAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[nc0.e.PATCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[nc0.e.OPTIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[nc0.e.TRACE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[nc0.e.CONNECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f85938a = iArr;
        }
    }

    public static final String a(nc0.e eVar) {
        s.k(eVar, "<this>");
        switch (a.f85938a[eVar.ordinal()]) {
            case 1:
                return "GET";
            case 2:
                return "PUT";
            case 3:
                return "POST";
            case 4:
                return "DELETE";
            case 5:
                return "HEAD";
            case 6:
                return "PATCH";
            case 7:
                return "OPTIONS";
            case 8:
                return "TRACE";
            case 9:
                return "CONNECT";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
