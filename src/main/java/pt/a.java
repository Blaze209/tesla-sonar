package pt;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Typeface f103985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2201a f103986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f103987c;

    /* JADX INFO: renamed from: pt.a$a, reason: collision with other inner class name */
    public interface InterfaceC2201a {
        void a(Typeface typeface);
    }

    public a(InterfaceC2201a interfaceC2201a, Typeface typeface) {
        this.f103985a = typeface;
        this.f103986b = interfaceC2201a;
    }

    private void d(Typeface typeface) {
        if (this.f103987c) {
            return;
        }
        this.f103986b.a(typeface);
    }

    @Override // pt.f
    public void a(int i11) {
        d(this.f103985a);
    }

    @Override // pt.f
    public void b(Typeface typeface, boolean z11) {
        d(typeface);
    }

    public void c() {
        this.f103987c = true;
    }
}
