package qy;

/* JADX INFO: loaded from: classes6.dex */
public class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final py.g f106196a;

    /* JADX INFO: renamed from: qy.a$a, reason: collision with other inner class name */
    class C2255a implements com.henninghall.date_picker.pickers.a.InterfaceC0708a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ry.g f106197a;

        C2255a(ry.g gVar) {
            this.f106197a = gVar;
        }

        @Override // com.henninghall.date_picker.pickers.a.InterfaceC0708a
        public void a() {
            a.this.f106196a.a(this.f106197a);
        }

        @Override // com.henninghall.date_picker.pickers.a.InterfaceC0708a
        public void b() {
            a.this.f106196a.b(this.f106197a);
        }
    }

    public a(py.g gVar) {
        this.f106196a = gVar;
    }

    @Override // qy.j
    public void a(ry.g gVar) {
        gVar.f109246d.setOnValueChangedListener(new C2255a(gVar));
    }
}
