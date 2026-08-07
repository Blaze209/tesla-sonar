package q20;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import org.json.JSONException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lq20/b;", "Lokhttp3/CookieJar;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Ljn0/h0;", "c", "()V", "", "Lokhttp3/Cookie;", "newCookies", "e", "(Ljava/util/Collection;)V", "Lq20/a;", "cookiesToRemove", DateTokenConverter.CONVERTER_KEY, "Lokhttp3/HttpUrl;", ImagesContract.URL, "", "loadForRequest", "(Lokhttp3/HttpUrl;)Ljava/util/List;", "cookies", "saveFromResponse", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "", "a", "Ljava/util/Set;", "Landroid/content/SharedPreferences;", "b", "Landroid/content/SharedPreferences;", "sharedPreferences", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements CookieJar {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<a> cookies;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    public b(Context context) {
        s.k(context, "context");
        Set<a> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        s.j(setNewSetFromMap, "newSetFromMap(ConcurrentHashMap())");
        this.cookies = setNewSetFromMap;
        SharedPreferences sharedPreferences = context.getSharedPreferences("cookie_persistance", 0);
        s.j(sharedPreferences, "context.getSharedPrefere…CE, Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences;
        c();
    }

    private final void c() {
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = this.sharedPreferences.getAll();
        s.j(all, "sharedPreferences.all");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            String str = value instanceof String ? (String) value : null;
            if (str != null) {
                try {
                    this.cookies.add(new a(str));
                } catch (JSONException unused) {
                    s.j(key, "key");
                    arrayList.add(key);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
    }

    private final void d(Collection<a> cookiesToRemove) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        for (a aVar : cookiesToRemove) {
            this.cookies.remove(aVar);
            editorEdit.remove(aVar.b());
        }
        editorEdit.apply();
    }

    private final void e(Collection<Cookie> newCookies) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        for (a aVar : a.INSTANCE.a(newCookies)) {
            this.cookies.remove(aVar);
            this.cookies.add(aVar);
            editorEdit.putString(aVar.b(), aVar.d());
        }
        editorEdit.apply();
    }

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl url) {
        s.k(url, "url");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (a aVar : this.cookies) {
            if (aVar.c()) {
                arrayList.add(aVar);
            } else if (aVar.getCookie().matches(url)) {
                arrayList2.add(aVar.getCookie());
            }
        }
        if (!arrayList.isEmpty()) {
            d(arrayList);
        }
        return arrayList2;
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
        s.k(url, "url");
        s.k(cookies, "cookies");
        e(cookies);
    }
}
