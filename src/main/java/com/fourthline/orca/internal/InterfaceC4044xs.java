package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4044xs {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.xs$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC4044xs interfaceC4044xs, Ds ds2, wn0.a aVar, wn0.a aVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handle");
            }
            if ((i11 & 2) != 0) {
                aVar = null;
            }
            if ((i11 & 4) != 0) {
                aVar2 = null;
            }
            interfaceC4044xs.a(ds2, aVar, aVar2);
        }
    }

    void a(Ds ds2);

    void a(Ds ds2, wn0.a aVar, wn0.a aVar2);
}
