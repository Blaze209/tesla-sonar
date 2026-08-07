package uv;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;

/* JADX INFO: loaded from: classes5.dex */
class i implements rv.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f116740a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f116741b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private rv.b f116742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f116743d;

    i(f fVar) {
        this.f116743d = fVar;
    }

    private void a() {
        if (this.f116740a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f116740a = true;
    }

    @Override // rv.f
    @NonNull
    public rv.f add(String str) {
        a();
        this.f116743d.d(this.f116742c, str, this.f116741b);
        return this;
    }

    void b(rv.b bVar, boolean z11) {
        this.f116740a = false;
        this.f116742c = bVar;
        this.f116741b = z11;
    }

    @Override // rv.f
    @NonNull
    public rv.f add(boolean z11) {
        a();
        this.f116743d.j(this.f116742c, z11, this.f116741b);
        return this;
    }
}
