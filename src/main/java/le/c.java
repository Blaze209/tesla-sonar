package le;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import android.widget.Toast;
import java.util.Locale;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/content/Context;", "", AnnotatedPrivateKey.LABEL, "text", "toastText", "Ljn0/h0;", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "duration", "c", "(Landroid/content/Context;Ljava/lang/String;I)V", "Ljava/util/Locale;", "locale", "b", "(Landroid/content/Context;Ljava/util/Locale;)Landroid/content/Context;", "components-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {
    public static final void a(Context context, String label, String text, String str) {
        s.k(context, "<this>");
        s.k(label, "label");
        s.k(text, "text");
        ClipboardManager clipboardManager = (ClipboardManager) androidx.core.content.b.getSystemService(context, ClipboardManager.class);
        if (clipboardManager == null) {
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText(label, text));
        if (str == null) {
            return;
        }
        d(context, str, 0, 2, null);
    }

    public static final Context b(Context context, Locale locale) {
        s.k(context, "<this>");
        s.k(locale, "locale");
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        LocaleList localeList = new LocaleList(locale);
        LocaleList.setDefault(localeList);
        configuration.setLocales(localeList);
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        return contextCreateConfigurationContext == null ? context : contextCreateConfigurationContext;
    }

    public static final void c(Context context, String text, int i11) {
        s.k(context, "<this>");
        s.k(text, "text");
        Toast.makeText(context, text, i11).show();
    }

    public static /* synthetic */ void d(Context context, String str, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        c(context, str, i11);
    }
}
