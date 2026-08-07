package sn;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsn/c;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "sectionName", "<init>", "(Ljava/lang/String;)V", "Ljn0/h0;", "close", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements AutoCloseable {
    public c(String sectionName) {
        s.k(sectionName, "sectionName");
        ep.a.c(0L, sectionName);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        ep.a.i(0L);
    }
}
