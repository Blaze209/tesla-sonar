package i4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010 \u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b!\u0010\u001fR \u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u0014\u0010(\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010'¨\u0006)"}, d2 = {"Li4/k;", "Li4/r;", "Li4/d;", "annotatedString", "Li4/r0;", "style", "", "Li4/d$c;", "Li4/w;", "placeholders", "Lw4/d;", "density", "Ln4/q$b;", "fontFamilyResolver", "<init>", "(Li4/d;Li4/r0;Ljava/util/List;Lw4/d;Ln4/q$b;)V", "Li4/u;", "defaultStyle", "h", "(Li4/u;Li4/u;)Li4/u;", "a", "Li4/d;", "c", "()Li4/d;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "", "Lkotlin/Lazy;", DateTokenConverter.CONVERTER_KEY, "()F", "minIntrinsicWidth", "f", "maxIntrinsicWidth", "Li4/q;", "e", "infoList", "", "()Z", "hasStaleResolvedFonts", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d annotatedString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<d.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy minIntrinsicWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy maxIntrinsicWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<ParagraphIntrinsicInfo> infoList;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<Float> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo;
            r intrinsics;
            List<ParagraphIntrinsicInfo> listE = k.this.e();
            if (listE.isEmpty()) {
                paragraphIntrinsicInfo = null;
            } else {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = listE.get(0);
                float f11 = paragraphIntrinsicInfo2.getIntrinsics().f();
                int iO = p013kotlin.collections.v.o(listE);
                int i11 = 1;
                if (1 <= iO) {
                    while (true) {
                        ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = listE.get(i11);
                        float f12 = paragraphIntrinsicInfo3.getIntrinsics().f();
                        if (Float.compare(f11, f12) < 0) {
                            paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                            f11 = f12;
                        }
                        if (i11 == iO) {
                            break;
                        }
                        i11++;
                    }
                }
                paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
            }
            ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
            return Float.valueOf((paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) ? BitmapDescriptorFactory.HUE_RED : intrinsics.f());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<Float> {
        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo;
            r intrinsics;
            List<ParagraphIntrinsicInfo> listE = k.this.e();
            if (listE.isEmpty()) {
                paragraphIntrinsicInfo = null;
            } else {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = listE.get(0);
                float fD = paragraphIntrinsicInfo2.getIntrinsics().d();
                int iO = p013kotlin.collections.v.o(listE);
                int i11 = 1;
                if (1 <= iO) {
                    while (true) {
                        ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = listE.get(i11);
                        float fD2 = paragraphIntrinsicInfo3.getIntrinsics().d();
                        if (Float.compare(fD, fD2) < 0) {
                            paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                            fD = fD2;
                        }
                        if (i11 == iO) {
                            break;
                        }
                        i11++;
                    }
                }
                paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
            }
            ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
            return Float.valueOf((paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) ? BitmapDescriptorFactory.HUE_RED : intrinsics.d());
        }
    }

    public k(d dVar, TextStyle textStyle, List<d.Range<Placeholder>> list, w4.d dVar2, n4.q.b bVar) {
        this.annotatedString = dVar;
        this.placeholders = list;
        jn0.p pVar = jn0.p.NONE;
        this.minIntrinsicWidth = jn0.m.a(pVar, new b());
        this.maxIntrinsicWidth = jn0.m.a(pVar, new a());
        ParagraphStyle paragraphStyle = textStyle.getParagraphStyle();
        List<d.Range<ParagraphStyle>> listM = e.m(dVar, paragraphStyle);
        ArrayList arrayList = new ArrayList(listM.size());
        int size = listM.size();
        for (int i11 = 0; i11 < size; i11++) {
            d.Range<ParagraphStyle> range = listM.get(i11);
            d dVarN = e.n(dVar, range.f(), range.d());
            arrayList.add(new ParagraphIntrinsicInfo(s.a(dVarN.getText(), textStyle.J(h(range.e(), paragraphStyle)), dVarN.g(), l.b(g(), range.f(), range.d()), dVar2, bVar), range.f(), range.d()));
        }
        this.infoList = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphStyle h(ParagraphStyle style, ParagraphStyle defaultStyle) {
        return !t4.l.j(style.getTextDirection(), t4.l.INSTANCE.f()) ? style : ParagraphStyle.b(style, 0, defaultStyle.getTextDirection(), 0L, null, null, null, 0, 0, null, 509, null);
    }

    @Override // i4.r
    public boolean a() {
        List<ParagraphIntrinsicInfo> list = this.infoList;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11).getIntrinsics().a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getAnnotatedString() {
        return this.annotatedString;
    }

    @Override // i4.r
    public float d() {
        return ((Number) this.minIntrinsicWidth.getValue()).floatValue();
    }

    public final List<ParagraphIntrinsicInfo> e() {
        return this.infoList;
    }

    @Override // i4.r
    public float f() {
        return ((Number) this.maxIntrinsicWidth.getValue()).floatValue();
    }

    public final List<d.Range<Placeholder>> g() {
        return this.placeholders;
    }
}
