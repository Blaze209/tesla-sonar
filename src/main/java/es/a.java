package es;

import android.net.Uri;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import hr.y;
import java.io.EOFException;
import java.util.List;
import java.util.Map;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a implements com.google.android.exoplayer2.source.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hr.p f63135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private hr.k f63136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private hr.l f63137c;

    public a(hr.p pVar) {
        this.f63135a = pVar;
    }

    @Override // com.google.android.exoplayer2.source.s
    public void a(long j11, long j12) {
        ((hr.k) ts.a.e(this.f63136b)).a(j11, j12);
    }

    @Override // com.google.android.exoplayer2.source.s
    public long b() {
        hr.l lVar = this.f63137c;
        if (lVar != null) {
            return lVar.getPosition();
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.source.s
    public void c() {
        hr.k kVar = this.f63136b;
        if (kVar instanceof or.f) {
            ((or.f) kVar).j();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    @Override // com.google.android.exoplayer2.source.s
    public void d(ss.g gVar, Uri uri, Map<String, List<String>> map, long j11, long j12, hr.m mVar) throws UnrecognizedInputFormatException {
        hr.e eVar = new hr.e(gVar, j11, j12);
        this.f63137c = eVar;
        if (this.f63136b != null) {
            return;
        }
        hr.k[] kVarArrB = this.f63135a.b(uri, map);
        if (kVarArrB.length == 1) {
            this.f63136b = kVarArrB[0];
        } else {
            for (hr.k kVar : kVarArrB) {
                try {
                    if (kVar.h(eVar)) {
                        this.f63136b = kVar;
                        ts.a.g(true);
                        eVar.g();
                        break;
                    } else {
                        boolean z11 = this.f63136b != null || eVar.getPosition() == j11;
                        ts.a.g(z11);
                        eVar.g();
                    }
                } catch (EOFException unused) {
                    if (this.f63136b != null || eVar.getPosition() == j11) {
                    }
                } catch (Throwable th2) {
                    ts.a.g(this.f63136b != null || eVar.getPosition() == j11);
                    eVar.g();
                    throw th2;
                }
                ts.a.g(z11);
                eVar.g();
            }
            if (this.f63136b == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + p0.I(kVarArrB) + ") could read the stream.", (Uri) ts.a.e(uri));
            }
        }
        this.f63136b.e(mVar);
    }

    @Override // com.google.android.exoplayer2.source.s
    public int e(y yVar) {
        return ((hr.k) ts.a.e(this.f63136b)).i((hr.l) ts.a.e(this.f63137c), yVar);
    }

    @Override // com.google.android.exoplayer2.source.s
    public void release() {
        hr.k kVar = this.f63136b;
        if (kVar != null) {
            kVar.release();
            this.f63136b = null;
        }
        this.f63137c = null;
    }
}
