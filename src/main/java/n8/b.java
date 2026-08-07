package n8;

import android.net.Uri;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import com.google.common.collect.f0;
import java.io.EOFException;
import java.util.List;
import java.util.Map;
import w8.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements androidx.media3.exoplayer.source.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w8.u f93545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w8.p f93546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w8.q f93547c;

    public b(w8.u uVar) {
        this.f93545a = uVar;
    }

    @Override // androidx.media3.exoplayer.source.w
    public void a(long j11, long j12) {
        ((w8.p) s7.a.f(this.f93546b)).a(j11, j12);
    }

    @Override // androidx.media3.exoplayer.source.w
    public long b() {
        w8.q qVar = this.f93547c;
        if (qVar != null) {
            return qVar.getPosition();
        }
        return -1L;
    }

    @Override // androidx.media3.exoplayer.source.w
    public void c() {
        w8.p pVar = this.f93546b;
        if (pVar == null) {
            return;
        }
        w8.p pVarI = pVar.i();
        if (pVarI instanceof p9.f) {
            ((p9.f) pVarI).k();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    @Override // androidx.media3.exoplayer.source.w
    public void d(p7.j jVar, Uri uri, Map<String, List<String>> map, long j11, long j12, w8.r rVar) throws UnrecognizedInputFormatException {
        w8.j jVar2 = new w8.j(jVar, j11, j12);
        this.f93547c = jVar2;
        if (this.f93546b != null) {
            return;
        }
        w8.p[] pVarArrB = this.f93545a.b(uri, map);
        com.google.common.collect.x.a aVarL = com.google.common.collect.x.l(pVarArrB.length);
        if (pVarArrB.length == 1) {
            this.f93546b = pVarArrB[0];
        } else {
            for (w8.p pVar : pVarArrB) {
                try {
                    if (pVar.l(jVar2)) {
                        this.f93546b = pVar;
                        s7.a.h(true);
                        jVar2.g();
                        break;
                    } else {
                        aVarL.j(pVar.j());
                        boolean z11 = this.f93546b != null || jVar2.getPosition() == j11;
                        s7.a.h(z11);
                        jVar2.g();
                    }
                } catch (EOFException unused) {
                    if (this.f93546b != null || jVar2.getPosition() == j11) {
                    }
                } catch (Throwable th2) {
                    s7.a.h(this.f93546b != null || jVar2.getPosition() == j11);
                    jVar2.g();
                    throw th2;
                }
                s7.a.h(z11);
                jVar2.g();
            }
            if (this.f93546b == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + ou.i.g(", ").d(f0.j(com.google.common.collect.x.o(pVarArrB), new ou.h() { // from class: n8.a
                    @Override // ou.h
                    public final Object apply(Object obj) {
                        return ((w8.p) obj).i().getClass().getSimpleName();
                    }
                })) + ") could read the stream.", (Uri) s7.a.f(uri), aVarL.k());
            }
        }
        this.f93546b.e(rVar);
    }

    @Override // androidx.media3.exoplayer.source.w
    public int e(i0 i0Var) {
        return ((w8.p) s7.a.f(this.f93546b)).h((w8.q) s7.a.f(this.f93547c), i0Var);
    }

    @Override // androidx.media3.exoplayer.source.w
    public void release() {
        w8.p pVar = this.f93546b;
        if (pVar != null) {
            pVar.release();
            this.f93546b = null;
        }
        this.f93547c = null;
    }
}
