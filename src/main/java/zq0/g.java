package zq0;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.spongycastle.asn1.eac.EACTags;
import zq0.a;

/* JADX INFO: loaded from: classes10.dex */
public class g<B extends a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c<B> f128496a;

    public g(c<B> cVar) {
        this.f128496a = cVar;
    }

    private void b(ap0.d dVar, int i11, h<B> hVar) throws IOException {
        dVar.n(161);
        for (Map.Entry<Integer, byte[]> entry : hVar.a().k1().b().entrySet()) {
            dVar.n(entry.getKey().intValue());
            dVar.o(entry.getValue());
        }
        dVar.p();
    }

    private void c(ap0.d dVar, int i11, h<B> hVar) throws IOException {
        dVar.n(EACTags.BIOMETRIC_INFORMATION_TEMPLATE);
        b(dVar, i11, hVar);
        e(dVar, hVar.a());
        dVar.p();
    }

    private void d(List<d> list, OutputStream outputStream) throws IOException {
        ap0.d dVar = outputStream instanceof ap0.d ? (ap0.d) outputStream : new ap0.d(outputStream);
        dVar.n(EACTags.BIOMETRIC_INFORMATION_GROUP_TEMPLATE);
        dVar.n(2);
        int size = list.size();
        dVar.o(new byte[]{(byte) size});
        for (int i11 = 0; i11 < size; i11++) {
            c(dVar, i11, (h) list.get(i11));
        }
        dVar.p();
    }

    private void e(ap0.d dVar, B b11) throws IOException {
        dVar.n(EACTags.CARDHOLDER_BIOMETRIC_DATA);
        this.f128496a.a(b11, dVar);
        dVar.p();
    }

    public void a(d dVar, OutputStream outputStream) throws IOException {
        if (dVar instanceof h) {
            d(Arrays.asList(dVar), outputStream);
        } else if (dVar instanceof e) {
            d(((e) dVar).b(), outputStream);
        }
    }
}
