package d8;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p7.m0;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public class c implements l8.a<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f59778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f59779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f59780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f59781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f59782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f59783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f59784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f59785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f59786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f59787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f59788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f59789l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<g> f59790m;

    public c(long j11, long j12, long j13, boolean z11, long j14, long j15, long j16, long j17, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        this.f59778a = j11;
        this.f59779b = j12;
        this.f59780c = j13;
        this.f59781d = z11;
        this.f59782e = j14;
        this.f59783f = j15;
        this.f59784g = j16;
        this.f59785h = j17;
        this.f59789l = hVar;
        this.f59786i = oVar;
        this.f59788k = uri;
        this.f59787j = lVar;
        this.f59790m = list == null ? Collections.EMPTY_LIST : list;
    }

    private static ArrayList<a> c(List<a> list, LinkedList<m0> linkedList) {
        m0 m0VarPoll = linkedList.poll();
        int i11 = m0VarPoll.f101427a;
        ArrayList<a> arrayList = new ArrayList<>();
        do {
            int i12 = m0VarPoll.f101428b;
            a aVar = list.get(i12);
            List<j> list2 = aVar.f59770c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(m0VarPoll.f101429c));
                m0VarPoll = linkedList.poll();
                if (m0VarPoll.f101427a != i11) {
                    break;
                }
            } while (m0VarPoll.f101428b == i12);
            arrayList.add(new a(aVar.f59768a, aVar.f59769b, arrayList2, aVar.f59771d, aVar.f59772e, aVar.f59773f));
        } while (m0VarPoll.f101427a == i11);
        linkedList.addFirst(m0VarPoll);
        return arrayList;
    }

    @Override // l8.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c a(List<m0> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new m0(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= e()) {
                break;
            }
            if (((m0) linkedList.peek()).f101427a != i11) {
                long jF = f(i11);
                if (jF != -9223372036854775807L) {
                    j11 += jF;
                }
            } else {
                g gVarD = d(i11);
                arrayList.add(new g(gVarD.f59814a, gVarD.f59815b - j11, c(gVarD.f59816c, linkedList), gVarD.f59817d));
            }
            i11++;
        }
        long j12 = this.f59779b;
        return new c(this.f59778a, j12 != -9223372036854775807L ? j12 - j11 : -9223372036854775807L, this.f59780c, this.f59781d, this.f59782e, this.f59783f, this.f59784g, this.f59785h, this.f59789l, this.f59786i, this.f59787j, this.f59788k, arrayList);
    }

    public final g d(int i11) {
        return this.f59790m.get(i11);
    }

    public final int e() {
        return this.f59790m.size();
    }

    public final long f(int i11) {
        long j11;
        long j12;
        if (i11 == this.f59790m.size() - 1) {
            j11 = this.f59779b;
            if (j11 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j12 = this.f59790m.get(i11).f59815b;
        } else {
            j11 = this.f59790m.get(i11 + 1).f59815b;
            j12 = this.f59790m.get(i11).f59815b;
        }
        return j11 - j12;
    }

    public final long g(int i11) {
        return q0.b1(f(i11));
    }
}
