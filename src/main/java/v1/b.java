package v1;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\bÇ\u0002\u0018\u00002\u00020\u0001:\u000521$\u001a\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001e\u0010\u001bJ/\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ/\u0010 \u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b \u0010\u001bJ/\u0010!\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b!\u0010\u001bR \u0010'\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010\u0003\u001a\u0004\b$\u0010%R \u0010*\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010#\u0012\u0004\b)\u0010\u0003\u001a\u0004\b(\u0010%R \u00100\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010\u0003\u001a\u0004\b-\u0010.R \u00104\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010,\u0012\u0004\b3\u0010\u0003\u001a\u0004\b2\u0010.R \u00108\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u00105\u0012\u0004\b7\u0010\u0003\u001a\u0004\b\"\u00106R \u0010:\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u00105\u0012\u0004\b9\u0010\u0003\u001a\u0004\b1\u00106R \u0010<\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00105\u0012\u0004\b;\u0010\u0003\u001a\u0004\b+\u00106R \u0010?\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u00105\u0012\u0004\b>\u0010\u0003\u001a\u0004\b=\u00106\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@"}, d2 = {"Lv1/b;", "", "<init>", "()V", "Lw4/h;", "space", "Lv1/b$f;", "n", "(F)Lv1/b$f;", "Ld3/c$b;", "alignment", "Lv1/b$e;", "o", "(FLd3/c$b;)Lv1/b$e;", "Ld3/c$c;", "Lv1/b$m;", "p", "(FLd3/c$c;)Lv1/b$m;", "", "totalSize", "", "size", "outPosition", "", "reverseInput", "Ljn0/h0;", "j", "(I[I[IZ)V", IntegerTokenConverter.CONVERTER_KEY, "([I[IZ)V", "h", "m", "l", "k", "b", "Lv1/b$e;", "f", "()Lv1/b$e;", "getStart$annotations", "Start", "c", "getEnd$annotations", "End", DateTokenConverter.CONVERTER_KEY, "Lv1/b$m;", "g", "()Lv1/b$m;", "getTop$annotations", "Top", "e", "a", "getBottom$annotations", "Bottom", "Lv1/b$f;", "()Lv1/b$f;", "getCenter$annotations", "Center", "getSpaceEvenly$annotations", "SpaceEvenly", "getSpaceBetween$annotations", "SpaceBetween", "getSpaceAround", "getSpaceAround$annotations", "SpaceAround", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f117444a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final e Start = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final e End = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final m Top = new l();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final m Bottom = new C2522b();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final f Center = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final f SpaceEvenly = new i();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final f SpaceBetween = new h();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final f SpaceAround = new g();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\f\u0010\rR \u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0010\u0010\rR \u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\n\u0010\rR \u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\rR \u0010\u001d\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001b\u0010\rR \u0010!\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u000b\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lv1/b$a;", "", "<init>", "()V", "Lw4/h;", "space", "Lv1/b$f;", "c", "(F)Lv1/b$f;", "Lv1/b$e;", "b", "Lv1/b$e;", "a", "()Lv1/b$e;", "getLeft$annotations", "Left", "getCenter", "getCenter$annotations", "Center", DateTokenConverter.CONVERTER_KEY, "getRight$annotations", "Right", "e", "getSpaceBetween", "getSpaceBetween$annotations", "SpaceBetween", "f", "getSpaceEvenly", "getSpaceEvenly$annotations", "SpaceEvenly", "g", "getSpaceAround", "getSpaceAround$annotations", "SpaceAround", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f117453a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final e Left = new C2521b();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final e Center = new C2520a();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final e Right = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final e SpaceBetween = new e();

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final e SpaceEvenly = new f();

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final e SpaceAround = new d();

        /* JADX INFO: renamed from: v1.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"v1/b$a$a", "Lv1/b$e;", "Lw4/d;", "", "totalSize", "", "sizes", "Lw4/t;", "layoutDirection", "outPositions", "Ljn0/h0;", "b", "(Lw4/d;I[ILw4/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C2520a implements e {
            C2520a() {
            }

            @Override // v1.b.e
            public void b(w4.d dVar, int i11, int[] iArr, w4.t tVar, int[] iArr2) {
                b.f117444a.h(i11, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        }

        /* JADX INFO: renamed from: v1.b$a$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"v1/b$a$b", "Lv1/b$e;", "Lw4/d;", "", "totalSize", "", "sizes", "Lw4/t;", "layoutDirection", "outPositions", "Ljn0/h0;", "b", "(Lw4/d;I[ILw4/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C2521b implements e {
            C2521b() {
            }

            @Override // v1.b.e
            public void b(w4.d dVar, int i11, int[] iArr, w4.t tVar, int[] iArr2) {
                b.f117444a.i(iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"v1/b$a$c", "Lv1/b$e;", "Lw4/d;", "", "totalSize", "", "sizes", "Lw4/t;", "layoutDirection", "outPositions", "Ljn0/h0;", "b", "(Lw4/d;I[ILw4/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c implements e {
            c() {
            }

            @Override // v1.b.e
            public void b(w4.d dVar, int i11, int[] iArr, w4.t tVar, int[] iArr2) {
                b.f117444a.j(i11, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"v1/b$a$d", "Lv1/b$e;", "Lw4/d;", "", "totalSize", "", "sizes", "Lw4/t;", "layoutDirection", "outPositions", "Ljn0/h0;", "b", "(Lw4/d;I[ILw4/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class d implements e {
            d() {
            }

            @Override // v1.b.e
            public void b(w4.d dVar, int i11, int[] iArr, w4.t tVar, int[] iArr2) {
                b.f117444a.k(i11, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"v1/b$a$e", "Lv1/b$e;", "Lw4/d;", "", "totalSize", "", "sizes", "Lw4/t;", "layoutDirection", "outPositions", "Ljn0/h0;", "b", "(Lw4/d;I[ILw4/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class e implements e {
            e() {
            }

            @Override // v1.b.e
            public void b(w4.d dVar, int i11, int[] iArr, w4.t tVar, int[] iArr2) {
                b.f117444a.l(i11, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"v1/b$a$f", "Lv1/b$e;", "Lw4/d;", "", "totalSize", "", "sizes", "Lw4/t;", "layoutDirection", "outPositions", "Ljn0/h0;", "b", "(Lw4/d;I[ILw4/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class f implements e {
            f() {
            }

            @Override // v1.b.e
            public void b(w4.d dVar, int i11, int[] iArr, w4.t tVar, int[] iArr2) {
                b.f117444a.m(i11, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        }

        private a() {
        }

        public final e a() {
            return Left;
        }

        public final e b() {
            return Right;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final f c(float space) {
            return new j(space, false, null, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: v1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"v1/b$b", "Lv1/b$m;", "Lw4/d;", "", "totalSize", "", "sizes", "outPositions", "Ljn0/h0;", "c", "(Lw4/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C2522b implements m {
        C2522b() {
        }

        @Override // v1.b.m
        public void c(w4.d dVar, int i11, int[] iArr, int[] iArr2) {
            b.f117444a.j(i11, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"v1/b$c", "Lv1/b$f;", "Lw4/d;", "", "totalSize", "", "sizes", "Lw4/t;", "layoutDirection", "outPositions", "Ljn0/h0;", "b", "(Lw4/d;I[ILw4/t;[I)V", "c", "(Lw4/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Lw4/h;", "a", Gender.FEMALE, "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = w4.h.g(0);

        c() {
        }

        @Override // v1.b.e, v1.b.m
        /* JADX INFO: renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // v1.b.e
        public void b(w4.d dVar, int i11, int[] iArr, w4.t tVar, int[] iArr2) {
            if (tVar == w4.t.Ltr) {
                b.f117444a.h(i11, iArr, iArr2, false);
            } else {
                b.f117444a.h(i11, iArr, iArr2, true);
            }
        }

        @Override // v1.b.m
        public void c(w4.d dVar, int i11, int[] iArr, int[] iArr2) {
            b.f117444a.h(i11, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"v1/b$d", "Lv1/b$e;", "Lw4/d;", "", "totalSize", "", "sizes", "Lw4/t;", "layoutDirection", "outPositions", "Ljn0/h0;", "b", "(Lw4/d;I[ILw4/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements e {
        d() {
        }

        @Override // v1.b.e
        public void b(w4.d dVar, int i11, int[] iArr, w4.t tVar, int[] iArr2) {
            if (tVar == w4.t.Ltr) {
                b.f117444a.j(i11, iArr, iArr2, false);
            } else {
                b.f117444a.i(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lv1/b$e;", "", "Lw4/d;", "", "totalSize", "", "sizes", "Lw4/t;", "layoutDirection", "outPositions", "Ljn0/h0;", "b", "(Lw4/d;I[ILw4/t;[I)V", "Lw4/h;", "a", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface e {
        /* JADX INFO: renamed from: a */
        default float getSpacing() {
            return w4.h.g(0);
        }

        void b(w4.d dVar, int i11, int[] iArr, w4.t tVar, int[] iArr2);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lv1/b$f;", "Lv1/b$e;", "Lv1/b$m;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface f extends e, m {
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"v1/b$g", "Lv1/b$f;", "Lw4/d;", "", "totalSize", "", "sizes", "Lw4/t;", "layoutDirection", "outPositions", "Ljn0/h0;", "b", "(Lw4/d;I[ILw4/t;[I)V", "c", "(Lw4/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Lw4/h;", "a", Gender.FEMALE, "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = w4.h.g(0);

        g() {
        }

        @Override // v1.b.e, v1.b.m
        /* JADX INFO: renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // v1.b.e
        public void b(w4.d dVar, int i11, int[] iArr, w4.t tVar, int[] iArr2) {
            if (tVar == w4.t.Ltr) {
                b.f117444a.k(i11, iArr, iArr2, false);
            } else {
                b.f117444a.k(i11, iArr, iArr2, true);
            }
        }

        @Override // v1.b.m
        public void c(w4.d dVar, int i11, int[] iArr, int[] iArr2) {
            b.f117444a.k(i11, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"v1/b$h", "Lv1/b$f;", "Lw4/d;", "", "totalSize", "", "sizes", "Lw4/t;", "layoutDirection", "outPositions", "Ljn0/h0;", "b", "(Lw4/d;I[ILw4/t;[I)V", "c", "(Lw4/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Lw4/h;", "a", Gender.FEMALE, "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = w4.h.g(0);

        h() {
        }

        @Override // v1.b.e, v1.b.m
        /* JADX INFO: renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // v1.b.e
        public void b(w4.d dVar, int i11, int[] iArr, w4.t tVar, int[] iArr2) {
            if (tVar == w4.t.Ltr) {
                b.f117444a.l(i11, iArr, iArr2, false);
            } else {
                b.f117444a.l(i11, iArr, iArr2, true);
            }
        }

        @Override // v1.b.m
        public void c(w4.d dVar, int i11, int[] iArr, int[] iArr2) {
            b.f117444a.l(i11, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"v1/b$i", "Lv1/b$f;", "Lw4/d;", "", "totalSize", "", "sizes", "Lw4/t;", "layoutDirection", "outPositions", "Ljn0/h0;", "b", "(Lw4/d;I[ILw4/t;[I)V", "c", "(Lw4/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Lw4/h;", "a", Gender.FEMALE, "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class i implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = w4.h.g(0);

        i() {
        }

        @Override // v1.b.e, v1.b.m
        /* JADX INFO: renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // v1.b.e
        public void b(w4.d dVar, int i11, int[] iArr, w4.t tVar, int[] iArr2) {
            if (tVar == w4.t.Ltr) {
                b.f117444a.m(i11, iArr, iArr2, false);
            } else {
                b.f117444a.m(i11, iArr, iArr2, true);
            }
        }

        @Override // v1.b.m
        public void c(w4.d dVar, int i11, int[] iArr, int[] iArr2) {
            b.f117444a.m(i11, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0015\u001a\u00020\u0012*\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&R+\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b(\u0010)R \u0010+\u001a\u00020\u00028\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b \u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Lv1/b$j;", "Lv1/b$f;", "Lw4/h;", "space", "", "rtlMirror", "Lkotlin/Function2;", "", "Lw4/t;", "alignment", "<init>", "(FZLwn0/p;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lw4/d;", "totalSize", "", "sizes", "layoutDirection", "outPositions", "Ljn0/h0;", "b", "(Lw4/d;I[ILw4/t;[I)V", "c", "(Lw4/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", Gender.FEMALE, "getSpace-D9Ej5fM", "()F", "Z", "getRtlMirror", "()Z", "Lwn0/p;", "getAlignment", "()Lwn0/p;", DateTokenConverter.CONVERTER_KEY, "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class j implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float space;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean rtlMirror;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final wn0.p<Integer, w4.t, Integer> alignment;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float spacing;

        public /* synthetic */ j(float f11, boolean z11, wn0.p pVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(f11, z11, pVar);
        }

        @Override // v1.b.e, v1.b.m
        /* JADX INFO: renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // v1.b.e
        public void b(w4.d dVar, int i11, int[] iArr, w4.t tVar, int[] iArr2) {
            int i12;
            int iMin;
            if (iArr.length == 0) {
                return;
            }
            int iI1 = dVar.i1(this.space);
            boolean z11 = this.rtlMirror && tVar == w4.t.Rtl;
            b bVar = b.f117444a;
            if (z11) {
                i12 = 0;
                iMin = 0;
                for (int length = iArr.length - 1; -1 < length; length--) {
                    int i13 = iArr[length];
                    int iMin2 = Math.min(i12, i11 - i13);
                    iArr2[length] = iMin2;
                    iMin = Math.min(iI1, (i11 - iMin2) - i13);
                    i12 = iArr2[length] + i13 + iMin;
                }
            } else {
                int length2 = iArr.length;
                int i14 = 0;
                i12 = 0;
                iMin = 0;
                int i15 = 0;
                while (i14 < length2) {
                    int i16 = iArr[i14];
                    int iMin3 = Math.min(i12, i11 - i16);
                    iArr2[i15] = iMin3;
                    int iMin4 = Math.min(iI1, (i11 - iMin3) - i16);
                    int i17 = iArr2[i15] + i16 + iMin4;
                    i14++;
                    iMin = iMin4;
                    i12 = i17;
                    i15++;
                }
            }
            int i18 = i12 - iMin;
            wn0.p<Integer, w4.t, Integer> pVar = this.alignment;
            if (pVar == null || i18 >= i11) {
                return;
            }
            int iIntValue = pVar.invoke(Integer.valueOf(i11 - i18), tVar).intValue();
            int length3 = iArr2.length;
            for (int i19 = 0; i19 < length3; i19++) {
                iArr2[i19] = iArr2[i19] + iIntValue;
            }
        }

        @Override // v1.b.m
        public void c(w4.d dVar, int i11, int[] iArr, int[] iArr2) {
            b(dVar, i11, iArr, w4.t.Ltr, iArr2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return w4.h.i(this.space, jVar.space) && this.rtlMirror == jVar.rtlMirror && p013kotlin.jvm.internal.s.f(this.alignment, jVar.alignment);
        }

        public int hashCode() {
            int iJ = ((w4.h.j(this.space) * 31) + Boolean.hashCode(this.rtlMirror)) * 31;
            wn0.p<Integer, w4.t, Integer> pVar = this.alignment;
            return iJ + (pVar == null ? 0 : pVar.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.rtlMirror ? "" : "Absolute");
            sb2.append("Arrangement#spacedAligned(");
            sb2.append((Object) w4.h.k(this.space));
            sb2.append(", ");
            sb2.append(this.alignment);
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb2.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private j(float f11, boolean z11, wn0.p<? super Integer, ? super w4.t, Integer> pVar) {
            this.space = f11;
            this.rtlMirror = z11;
            this.alignment = pVar;
            this.spacing = f11;
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"v1/b$k", "Lv1/b$e;", "Lw4/d;", "", "totalSize", "", "sizes", "Lw4/t;", "layoutDirection", "outPositions", "Ljn0/h0;", "b", "(Lw4/d;I[ILw4/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class k implements e {
        k() {
        }

        @Override // v1.b.e
        public void b(w4.d dVar, int i11, int[] iArr, w4.t tVar, int[] iArr2) {
            if (tVar == w4.t.Ltr) {
                b.f117444a.i(iArr, iArr2, false);
            } else {
                b.f117444a.j(i11, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"v1/b$l", "Lv1/b$m;", "Lw4/d;", "", "totalSize", "", "sizes", "outPositions", "Ljn0/h0;", "c", "(Lw4/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class l implements m {
        l() {
        }

        @Override // v1.b.m
        public void c(w4.d dVar, int i11, int[] iArr, int[] iArr2) {
            b.f117444a.i(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lv1/b$m;", "", "Lw4/d;", "", "totalSize", "", "sizes", "outPositions", "Ljn0/h0;", "c", "(Lw4/d;I[I[I)V", "Lw4/h;", "a", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface m {
        /* JADX INFO: renamed from: a */
        default float getSpacing() {
            return w4.h.g(0);
        }

        void c(w4.d dVar, int i11, int[] iArr, int[] iArr2);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "Lw4/t;", "layoutDirection", "a", "(ILw4/t;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class n extends p013kotlin.jvm.internal.u implements wn0.p<Integer, w4.t, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f117468c = new n();

        n() {
            super(2);
        }

        public final Integer a(int i11, w4.t tVar) {
            return Integer.valueOf(d3.c.INSTANCE.k().a(0, i11, tVar));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, w4.t tVar) {
            return a(num.intValue(), tVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "Lw4/t;", "layoutDirection", "a", "(ILw4/t;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class o extends p013kotlin.jvm.internal.u implements wn0.p<Integer, w4.t, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d3.c.b f117469c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(d3.c.b bVar) {
            super(2);
            this.f117469c = bVar;
        }

        public final Integer a(int i11, w4.t tVar) {
            return Integer.valueOf(this.f117469c.a(0, i11, tVar));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, w4.t tVar) {
            return a(num.intValue(), tVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "Lw4/t;", "<anonymous parameter 1>", "a", "(ILw4/t;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class p extends p013kotlin.jvm.internal.u implements wn0.p<Integer, w4.t, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d3.c.InterfaceC1212c f117470c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(d3.c.InterfaceC1212c interfaceC1212c) {
            super(2);
            this.f117470c = interfaceC1212c;
        }

        public final Integer a(int i11, w4.t tVar) {
            return Integer.valueOf(this.f117470c.a(0, i11));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, w4.t tVar) {
            return a(num.intValue(), tVar);
        }
    }

    private b() {
    }

    public final m a() {
        return Bottom;
    }

    public final f b() {
        return Center;
    }

    public final e c() {
        return End;
    }

    public final f d() {
        return SpaceBetween;
    }

    public final f e() {
        return SpaceEvenly;
    }

    public final e f() {
        return Start;
    }

    public final m g() {
        return Top;
    }

    public final void h(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : size) {
            i12 += i13;
        }
        float f11 = (totalSize - i12) / 2;
        if (!reverseInput) {
            int length = size.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = size[i11];
                outPosition[i14] = Math.round(f11);
                f11 += i15;
                i11++;
                i14++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = size[length2];
            outPosition[length2] = Math.round(f11);
            f11 += i16;
        }
    }

    public final void i(int[] size, int[] outPosition, boolean reverseInput) {
        int i11 = 0;
        if (!reverseInput) {
            int length = size.length;
            int i12 = 0;
            int i13 = 0;
            while (i11 < length) {
                int i14 = size[i11];
                outPosition[i12] = i13;
                i13 += i14;
                i11++;
                i12++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i15 = size[length2];
            outPosition[length2] = i11;
            i11 += i15;
        }
    }

    public final void j(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : size) {
            i12 += i13;
        }
        int i14 = totalSize - i12;
        if (!reverseInput) {
            int length = size.length;
            int i15 = 0;
            while (i11 < length) {
                int i16 = size[i11];
                outPosition[i15] = i14;
                i14 += i16;
                i11++;
                i15++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i17 = size[length2];
            outPosition[length2] = i14;
            i14 += i17;
        }
    }

    public final void k(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : size) {
            i12 += i13;
        }
        float length = !(size.length == 0) ? (totalSize - i12) / size.length : BitmapDescriptorFactory.HUE_RED;
        float f11 = length / 2;
        if (reverseInput) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i14 = size[length2];
                outPosition[length2] = Math.round(f11);
                f11 += i14 + length;
            }
            return;
        }
        int length3 = size.length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = size[i11];
            outPosition[i15] = Math.round(f11);
            f11 += i16 + length;
            i11++;
            i15++;
        }
    }

    public final void l(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        if (size.length == 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 : size) {
            i12 += i13;
        }
        float fMax = (totalSize - i12) / Math.max(p013kotlin.collections.n.s0(size), 1);
        float f11 = (reverseInput && size.length == 1) ? fMax : BitmapDescriptorFactory.HUE_RED;
        if (reverseInput) {
            for (int length = size.length - 1; -1 < length; length--) {
                int i14 = size[length];
                outPosition[length] = Math.round(f11);
                f11 += i14 + fMax;
            }
            return;
        }
        int length2 = size.length;
        int i15 = 0;
        while (i11 < length2) {
            int i16 = size[i11];
            outPosition[i15] = Math.round(f11);
            f11 += i16 + fMax;
            i11++;
            i15++;
        }
    }

    public final void m(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : size) {
            i12 += i13;
        }
        float length = (totalSize - i12) / (size.length + 1);
        if (reverseInput) {
            float f11 = length;
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i14 = size[length2];
                outPosition[length2] = Math.round(f11);
                f11 += i14 + length;
            }
            return;
        }
        int length3 = size.length;
        float f12 = length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = size[i11];
            outPosition[i15] = Math.round(f12);
            f12 += i16 + length;
            i11++;
            i15++;
        }
    }

    public final f n(float space) {
        return new j(space, true, n.f117468c, null);
    }

    public final e o(float space, d3.c.b alignment) {
        return new j(space, true, new o(alignment), null);
    }

    public final m p(float space, d3.c.InterfaceC1212c alignment) {
        return new j(space, false, new p(alignment), null);
    }
}
