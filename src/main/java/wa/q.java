package wa;

import ch.qos.logback.classic.spi.CallerData;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a!\u0010\u0006\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\"\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u0012\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "count", "Ljn0/h0;", "a", "(Ljava/lang/StringBuilder;I)V", "", "", "[Ljava/lang/String;", "getEMPTY_STRING_ARRAY$annotations", "()V", "EMPTY_STRING_ARRAY", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f121611a = new String[0];

    public static final void a(StringBuilder builder, int i11) {
        p013kotlin.jvm.internal.s.k(builder, "builder");
        for (int i12 = 0; i12 < i11; i12++) {
            builder.append(CallerData.NA);
            if (i12 < i11 - 1) {
                builder.append(",");
            }
        }
    }
}
