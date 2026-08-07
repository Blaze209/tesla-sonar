package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import g8.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.webrtc.WebrtcBuildVersion;
import p7.m0;
import p7.n;
import p7.u;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f10231n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Uri> f10232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<b> f10233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<a> f10234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<a> f10235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<a> f10236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<a> f10237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u f10238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<u> f10239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, String> f10240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<n> f10241m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f10242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f10243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f10244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f10245d;

        public a(Uri uri, u uVar, String str, String str2) {
            this.f10242a = uri;
            this.f10243b = uVar;
            this.f10244c = str;
            this.f10245d = str2;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f10246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f10247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f10248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f10249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f10250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f10251f;

        public b(Uri uri, u uVar, String str, String str2, String str3, String str4) {
            this.f10246a = uri;
            this.f10247b = uVar;
            this.f10248c = str;
            this.f10249d = str2;
            this.f10250e = str3;
            this.f10251f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new u.b().j0(WebrtcBuildVersion.maint_version).W("application/x-mpegURL").P(), null, null, null, null);
        }

        public b a(u uVar) {
            return new b(this.f10246a, uVar, this.f10248c, this.f10249d, this.f10250e, this.f10251f);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        f10231n = new d("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public d(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, u uVar, List<u> list7, boolean z11, Map<String, String> map, List<n> list8) {
        super(str, list, z11);
        this.f10232d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f10233e = Collections.unmodifiableList(list2);
        this.f10234f = Collections.unmodifiableList(list3);
        this.f10235g = Collections.unmodifiableList(list4);
        this.f10236h = Collections.unmodifiableList(list5);
        this.f10237i = Collections.unmodifiableList(list6);
        this.f10238j = uVar;
        this.f10239k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f10240l = Collections.unmodifiableMap(map);
        this.f10241m = Collections.unmodifiableList(list8);
    }

    private static void b(List<a> list, List<Uri> list2) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            Uri uri = list.get(i11).f10242a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> d(List<T> list, int i11, List<m0> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i12 = 0; i12 < list.size(); i12++) {
            T t11 = list.get(i12);
            for (int i13 = 0; i13 < list2.size(); i13++) {
                m0 m0Var = list2.get(i13);
                if (m0Var.f101428b == i11 && m0Var.f101429c == i12) {
                    arrayList.add(t11);
                    break;
                }
            }
        }
        return arrayList;
    }

    public static d e(String str) {
        List listSingletonList = Collections.singletonList(b.b(Uri.parse(str)));
        List list = Collections.EMPTY_LIST;
        return new d("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
    }

    private static List<Uri> f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            Uri uri = list.get(i11).f10246a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // l8.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d a(List<m0> list) {
        String str = this.f67468a;
        List<String> list2 = this.f67469b;
        List listD = d(this.f10233e, 0, list);
        List list3 = Collections.EMPTY_LIST;
        return new d(str, list2, listD, list3, d(this.f10235g, 1, list), d(this.f10236h, 2, list), list3, this.f10238j, this.f10239k, this.f67470c, this.f10240l, this.f10241m);
    }
}
