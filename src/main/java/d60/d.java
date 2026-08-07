package d60;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Ld60/d;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "c", "()Z", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()V", "a", "Landroid/content/SharedPreferences;", "Lkotlin/Lazy;", "b", "()Landroid/content/SharedPreferences;", "sharedPrefs", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f59734c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy sharedPrefs;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "b", "()Landroid/content/SharedPreferences;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.a<SharedPreferences> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f59736c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.f59736c = context;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return this.f59736c.getSharedPreferences("PaymentSheet_LinkStore", 0);
        }
    }

    public d(Context context) {
        s.k(context, "context");
        this.sharedPrefs = m.b(new b(context));
    }

    private final SharedPreferences b() {
        Object value = this.sharedPrefs.getValue();
        s.j(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    public final void a() {
        SharedPreferences.Editor editorEdit = b().edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public final boolean c() {
        return b().getBoolean("has_used_link", false);
    }

    public final void d() {
        SharedPreferences.Editor editorEdit = b().edit();
        editorEdit.putBoolean("has_used_link", true);
        editorEdit.apply();
    }
}
