package m3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j3.m;
import j3.n;
import k3.j1;
import k3.l3;
import k3.t3;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm3/d;", "Lm3/h;", "b", "(Lm3/d;)Lm3/h;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ:\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\u00020!8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"m3/b$a", "Lm3/h;", "", "left", "top", "right", "bottom", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(FFFF)V", "Lk3/o1;", "clipOp", "a", "(FFFFI)V", "Lk3/t3;", "path", DateTokenConverter.CONVERTER_KEY, "(Lk3/t3;I)V", "c", "(FF)V", "degrees", "Lj3/g;", "pivot", "g", "(FJ)V", "scaleX", "scaleY", "f", "(FFJ)V", "Lk3/n3;", "matrix", "e", "([F)V", "Lj3/m;", "b", "()J", "size", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f90961a;

        a(d dVar) {
            this.f90961a = dVar;
        }

        @Override // m3.h
        public void a(float left, float top, float right, float bottom, int clipOp) {
            this.f90961a.a().a(left, top, right, bottom, clipOp);
        }

        @Override // m3.h
        public long b() {
            return this.f90961a.b();
        }

        @Override // m3.h
        public void c(float left, float top) {
            this.f90961a.a().c(left, top);
        }

        @Override // m3.h
        public void d(t3 path, int clipOp) {
            this.f90961a.a().d(path, clipOp);
        }

        @Override // m3.h
        public void e(float[] matrix) {
            this.f90961a.a().v(matrix);
        }

        @Override // m3.h
        public void f(float scaleX, float scaleY, long pivot) {
            j1 j1VarA = this.f90961a.a();
            j1VarA.c(j3.g.m(pivot), j3.g.n(pivot));
            j1VarA.k(scaleX, scaleY);
            j1VarA.c(-j3.g.m(pivot), -j3.g.n(pivot));
        }

        @Override // m3.h
        public void g(float degrees, long pivot) {
            j1 j1VarA = this.f90961a.a();
            j1VarA.c(j3.g.m(pivot), j3.g.n(pivot));
            j1VarA.q(degrees);
            j1VarA.c(-j3.g.m(pivot), -j3.g.n(pivot));
        }

        @Override // m3.h
        public void i(float left, float top, float right, float bottom) {
            j1 j1VarA = this.f90961a.a();
            d dVar = this.f90961a;
            long jA = n.a(m.k(b()) - (right + left), m.i(b()) - (bottom + top));
            if (!(m.k(jA) >= BitmapDescriptorFactory.HUE_RED && m.i(jA) >= BitmapDescriptorFactory.HUE_RED)) {
                l3.a("Width and height must be greater than or equal to zero");
            }
            dVar.f(jA);
            j1VarA.c(left, top);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h b(d dVar) {
        return new a(dVar);
    }
}
