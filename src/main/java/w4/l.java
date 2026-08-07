package w4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u0002*\u00020\u0003H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8&X§\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lw4/l;", "", "Lw4/h;", "Lw4/v;", "E", "(F)J", "p", "(J)F", "", "M1", "()F", "getFontScale$annotations", "()V", "fontScale", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface l {
    default long E(float f11) {
        x4.b bVar = x4.b.f122744a;
        if (!bVar.f(getFontScale())) {
            return w.g(f11 / getFontScale());
        }
        x4.a aVarB = bVar.b(getFontScale());
        return w.g(aVarB != null ? aVarB.a(f11) : f11 / getFontScale());
    }

    /* JADX INFO: renamed from: M1 */
    float getFontScale();

    default float p(long j11) {
        if (!x.g(v.g(j11), x.INSTANCE.b())) {
            m.b("Only Sp can convert to Px");
        }
        x4.b bVar = x4.b.f122744a;
        if (!bVar.f(getFontScale())) {
            return h.g(v.h(j11) * getFontScale());
        }
        x4.a aVarB = bVar.b(getFontScale());
        float fH = v.h(j11);
        return aVarB == null ? h.g(fH * getFontScale()) : h.g(aVarB.b(fH));
    }
}
