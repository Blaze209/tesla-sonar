package em;

import android.icu.util.ULocale;
import android.text.TextUtils;
import com.facebook.hermes.intl.JSRangeErrorException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class f implements b<ULocale> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ULocale f63068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ULocale.Builder f63069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63070c;

    private f(ULocale uLocale) {
        this.f63069b = null;
        this.f63070c = false;
        this.f63068a = uLocale;
    }

    public static b<ULocale> h() {
        return new f(ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public static b<ULocale> i(String str) {
        return new f(str);
    }

    public static b<ULocale> j(ULocale uLocale) {
        return new f(uLocale);
    }

    private void k() throws JSRangeErrorException {
        if (this.f63070c) {
            try {
                this.f63068a = this.f63069b.build();
                this.f63070c = false;
            } catch (RuntimeException e11) {
                throw new JSRangeErrorException(e11.getMessage());
            }
        }
    }

    @Override // em.b
    public String b() {
        return a().toLanguageTag();
    }

    @Override // em.b
    public void c(String str, ArrayList<String> arrayList) throws JSRangeErrorException {
        k();
        if (this.f63069b == null) {
            this.f63069b = new ULocale.Builder().setLocale(this.f63068a);
        }
        try {
            this.f63069b.setUnicodeLocaleKeyword(str, TextUtils.join("-", arrayList));
            this.f63070c = true;
        } catch (RuntimeException e11) {
            throw new JSRangeErrorException(e11.getMessage());
        }
    }

    @Override // em.b
    public HashMap<String, String> d() throws JSRangeErrorException {
        k();
        HashMap<String, String> map = new HashMap<>();
        Iterator<String> keywords = this.f63068a.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String next = keywords.next();
                map.put(g.b(next), this.f63068a.getKeywordValue(next));
            }
        }
        return map;
    }

    @Override // em.b
    public ArrayList<String> e(String str) throws JSRangeErrorException {
        k();
        String strA = g.a(str);
        ArrayList<String> arrayList = new ArrayList<>();
        String keywordValue = this.f63068a.getKeywordValue(strA);
        if (keywordValue != null && !keywordValue.isEmpty()) {
            Collections.addAll(arrayList, keywordValue.split("-|_"));
        }
        return arrayList;
    }

    @Override // em.b
    public b<ULocale> f() throws JSRangeErrorException {
        k();
        return new f(this.f63068a);
    }

    @Override // em.b
    public String g() {
        return getLocale().toLanguageTag();
    }

    @Override // em.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ULocale getLocale() throws JSRangeErrorException {
        k();
        return this.f63068a;
    }

    @Override // em.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ULocale a() throws JSRangeErrorException {
        k();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.f63068a);
        builder.clearExtensions();
        return builder.build();
    }

    private f(String str) throws JSRangeErrorException {
        this.f63068a = null;
        this.f63069b = null;
        this.f63070c = false;
        ULocale.Builder builder = new ULocale.Builder();
        this.f63069b = builder;
        try {
            builder.setLanguageTag(str);
            this.f63070c = true;
        } catch (RuntimeException e11) {
            throw new JSRangeErrorException(e11.getMessage());
        }
    }
}
