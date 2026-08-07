package vf;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(19)
public class l implements m, j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f119165d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final cg.j f119167f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f119162a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f119163b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f119164c = new Path();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<m> f119166e = new ArrayList();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f119168a;

        static {
            int[] iArr = new int[cg.j.a.values().length];
            f119168a = iArr;
            try {
                iArr[cg.j.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f119168a[cg.j.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f119168a[cg.j.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f119168a[cg.j.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f119168a[cg.j.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(cg.j jVar) {
        this.f119165d = jVar.c();
        this.f119167f = jVar;
    }

    private void d() {
        for (int i11 = 0; i11 < this.f119166e.size(); i11++) {
            this.f119164c.addPath(this.f119166e.get(i11).getPath());
        }
    }

    @TargetApi(19)
    private void e(Path.Op op2) {
        this.f119163b.reset();
        this.f119162a.reset();
        for (int size = this.f119166e.size() - 1; size >= 1; size--) {
            m mVar = this.f119166e.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List<m> listL = dVar.l();
                for (int size2 = listL.size() - 1; size2 >= 0; size2--) {
                    Path path = listL.get(size2).getPath();
                    path.transform(dVar.m());
                    this.f119163b.addPath(path);
                }
            } else {
                this.f119163b.addPath(mVar.getPath());
            }
        }
        m mVar2 = this.f119166e.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> listL2 = dVar2.l();
            for (int i11 = 0; i11 < listL2.size(); i11++) {
                Path path2 = listL2.get(i11).getPath();
                path2.transform(dVar2.m());
                this.f119162a.addPath(path2);
            }
        } else {
            this.f119162a.set(mVar2.getPath());
        }
        this.f119164c.op(this.f119162a, this.f119163b, op2);
    }

    @Override // vf.j
    public void c(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVarPrevious = listIterator.previous();
            if (cVarPrevious instanceof m) {
                this.f119166e.add((m) cVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // vf.c
    public void f(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < this.f119166e.size(); i11++) {
            this.f119166e.get(i11).f(list, list2);
        }
    }

    @Override // vf.m
    public Path getPath() {
        this.f119164c.reset();
        if (this.f119167f.d()) {
            return this.f119164c;
        }
        int i11 = a.f119168a[this.f119167f.b().ordinal()];
        if (i11 == 1) {
            d();
        } else if (i11 == 2) {
            e(Path.Op.UNION);
        } else if (i11 == 3) {
            e(Path.Op.REVERSE_DIFFERENCE);
        } else if (i11 == 4) {
            e(Path.Op.INTERSECT);
        } else if (i11 == 5) {
            e(Path.Op.XOR);
        }
        return this.f119164c;
    }
}
