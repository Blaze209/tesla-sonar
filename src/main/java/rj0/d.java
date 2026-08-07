package rj0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR)\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\nR)\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lrj0/d;", "", "<init>", "()V", "Lkotlin/Function2;", "Lrj0/h;", "Lrj0/i;", "", "b", "Lwn0/p;", "()Lwn0/p;", "Start", "c", "a", "Center", DateTokenConverter.CONVERTER_KEY, "getEnd", "End", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f108457a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p<h, SnapperLayoutItemInfo, Integer> Start = c.f108463c;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final p<h, SnapperLayoutItemInfo, Integer> Center = a.f108461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final p<h, SnapperLayoutItemInfo, Integer> End = b.f108462c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrj0/h;", "layout", "Lrj0/i;", "item", "", "a", "(Lrj0/h;Lrj0/i;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    static final class a extends u implements p<h, SnapperLayoutItemInfo, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f108461c = new a();

        a() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(h layout, SnapperLayoutItemInfo item) {
            s.k(layout, "layout");
            s.k(item, "item");
            return Integer.valueOf(layout.g() + (((layout.f() - layout.g()) - item.c()) / 2));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrj0/h;", "layout", "Lrj0/i;", "item", "", "a", "(Lrj0/h;Lrj0/i;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    static final class b extends u implements p<h, SnapperLayoutItemInfo, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f108462c = new b();

        b() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(h layout, SnapperLayoutItemInfo item) {
            s.k(layout, "layout");
            s.k(item, "item");
            return Integer.valueOf(layout.f() - item.c());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrj0/h;", "layout", "Lrj0/i;", "<anonymous parameter 1>", "", "a", "(Lrj0/h;Lrj0/i;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    static final class c extends u implements p<h, SnapperLayoutItemInfo, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f108463c = new c();

        c() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(h layout, SnapperLayoutItemInfo noName_1) {
            s.k(layout, "layout");
            s.k(noName_1, "$noName_1");
            return Integer.valueOf(layout.g());
        }
    }

    private d() {
    }

    public final p<h, SnapperLayoutItemInfo, Integer> a() {
        return Center;
    }

    public final p<h, SnapperLayoutItemInfo, Integer> b() {
        return Start;
    }
}
