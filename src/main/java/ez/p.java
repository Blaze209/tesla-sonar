package ez;

import dz.f0;
import dz.g0;
import dz.g1;
import dz.j0;
import dz.p1;
import dz.r0;
import dz.w0;
import dz.w1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import z0.d2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz0/d2$a;", "Ldz/p1;", "a", "(Lz0/d2$a;)Ldz/p1;", "react-native-vision-camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class p {
    public static final p1 a(d2.a aVar) {
        s.k(aVar, "<this>");
        if (!aVar.m()) {
            return null;
        }
        switch (aVar.k()) {
            case 0:
                return null;
            case 1:
                return new w1(false, aVar.j());
            case 2:
                return new j0(aVar.j());
            case 3:
                return new r0(aVar.j());
            case 4:
                return new g1(aVar.j());
            case 5:
                return new w0(aVar.j());
            case 6:
                return new g0(aVar.j());
            case 7:
                return new w1(false, aVar.j());
            case 8:
                return new g1(aVar.j());
            case 9:
                return new f0(aVar.j());
            case 10:
                return new w1(true, aVar.j());
            default:
                return new w1(false, aVar.j());
        }
    }
}
