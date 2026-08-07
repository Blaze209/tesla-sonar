package ql0;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView.BufferType f105657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tq0.d f105658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f105659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f105660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<i> f105661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f105662f;

    h(@NonNull TextView.BufferType bufferType, e.b bVar, @NonNull tq0.d dVar, @NonNull m mVar, @NonNull g gVar, @NonNull List<i> list, boolean z11) {
        this.f105657a = bufferType;
        this.f105658b = dVar;
        this.f105659c = mVar;
        this.f105660d = gVar;
        this.f105661e = list;
        this.f105662f = z11;
    }

    @Override // ql0.e
    public void c(@NonNull TextView textView, @NonNull String str) {
        d(textView, e(str));
    }

    @Override // ql0.e
    public void d(@NonNull TextView textView, @NonNull Spanned spanned) {
        Iterator<i> it = this.f105661e.iterator();
        while (it.hasNext()) {
            it.next().k(textView, spanned);
        }
        textView.setText(spanned, this.f105657a);
        Iterator<i> it2 = this.f105661e.iterator();
        while (it2.hasNext()) {
            it2.next().b(textView);
        }
    }

    @Override // ql0.e
    @NonNull
    public Spanned e(@NonNull String str) {
        Spanned spannedG = g(f(str));
        return (TextUtils.isEmpty(spannedG) && this.f105662f && !TextUtils.isEmpty(str)) ? new SpannableStringBuilder(str) : spannedG;
    }

    @NonNull
    public sq0.r f(@NonNull String str) {
        Iterator<i> it = this.f105661e.iterator();
        while (it.hasNext()) {
            str = it.next().g(str);
        }
        return this.f105658b.b(str);
    }

    @NonNull
    public Spanned g(@NonNull sq0.r rVar) {
        Iterator<i> it = this.f105661e.iterator();
        while (it.hasNext()) {
            it.next().a(rVar);
        }
        l lVarA = this.f105659c.a();
        rVar.a(lVarA);
        Iterator<i> it2 = this.f105661e.iterator();
        while (it2.hasNext()) {
            it2.next().c(rVar, lVarA);
        }
        return lVarA.builder().l();
    }
}
