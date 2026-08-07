package retrofit2;

import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes10.dex */
abstract class t<T> {

    class a extends t<Iterable<T>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, Iterable<T> iterable) {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                t.this.a(wVar, it.next());
            }
        }
    }

    class b extends t<Object> {
        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.t
        void a(w wVar, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i11 = 0; i11 < length; i11++) {
                t.this.a(wVar, Array.get(obj, i11));
            }
        }
    }

    static final class c<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f107946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f107947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final retrofit2.h<T, RequestBody> f107948c;

        c(Method method, int i11, retrofit2.h<T, RequestBody> hVar) {
            this.f107946a = method;
            this.f107947b = i11;
            this.f107948c = hVar;
        }

        @Override // retrofit2.t
        void a(w wVar, T t11) {
            if (t11 == null) {
                throw d0.p(this.f107946a, this.f107947b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                wVar.l(this.f107948c.convert(t11));
            } catch (IOException e11) {
                throw d0.q(this.f107946a, e11, this.f107947b, "Unable to convert " + t11 + " to RequestBody", new Object[0]);
            }
        }
    }

    static final class d<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f107949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final retrofit2.h<T, String> f107950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f107951c;

        d(String str, retrofit2.h<T, String> hVar, boolean z11) {
            Objects.requireNonNull(str, "name == null");
            this.f107949a = str;
            this.f107950b = hVar;
            this.f107951c = z11;
        }

        @Override // retrofit2.t
        void a(w wVar, T t11) {
            String strConvert;
            if (t11 == null || (strConvert = this.f107950b.convert(t11)) == null) {
                return;
            }
            wVar.a(this.f107949a, strConvert, this.f107951c);
        }
    }

    static final class e<T> extends t<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f107952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f107953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final retrofit2.h<T, String> f107954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f107955d;

        e(Method method, int i11, retrofit2.h<T, String> hVar, boolean z11) {
            this.f107952a = method;
            this.f107953b = i11;
            this.f107954c = hVar;
            this.f107955d = z11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, Map<String, T> map) {
            if (map == null) {
                throw d0.p(this.f107952a, this.f107953b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw d0.p(this.f107952a, this.f107953b, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw d0.p(this.f107952a, this.f107953b, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.f107954c.convert(value);
                if (strConvert == null) {
                    throw d0.p(this.f107952a, this.f107953b, "Field map value '" + value + "' converted to null by " + this.f107954c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                wVar.a(key, strConvert, this.f107955d);
            }
        }
    }

    static final class f<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f107956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final retrofit2.h<T, String> f107957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f107958c;

        f(String str, retrofit2.h<T, String> hVar, boolean z11) {
            Objects.requireNonNull(str, "name == null");
            this.f107956a = str;
            this.f107957b = hVar;
            this.f107958c = z11;
        }

        @Override // retrofit2.t
        void a(w wVar, T t11) {
            String strConvert;
            if (t11 == null || (strConvert = this.f107957b.convert(t11)) == null) {
                return;
            }
            wVar.b(this.f107956a, strConvert, this.f107958c);
        }
    }

    static final class g<T> extends t<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f107959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f107960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final retrofit2.h<T, String> f107961c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f107962d;

        g(Method method, int i11, retrofit2.h<T, String> hVar, boolean z11) {
            this.f107959a = method;
            this.f107960b = i11;
            this.f107961c = hVar;
            this.f107962d = z11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, Map<String, T> map) {
            if (map == null) {
                throw d0.p(this.f107959a, this.f107960b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw d0.p(this.f107959a, this.f107960b, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw d0.p(this.f107959a, this.f107960b, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                wVar.b(key, this.f107961c.convert(value), this.f107962d);
            }
        }
    }

    static final class h extends t<Headers> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f107963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f107964b;

        h(Method method, int i11) {
            this.f107963a = method;
            this.f107964b = i11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, Headers headers) {
            if (headers == null) {
                throw d0.p(this.f107963a, this.f107964b, "Headers parameter must not be null.", new Object[0]);
            }
            wVar.c(headers);
        }
    }

    static final class i<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f107965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f107966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Headers f107967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final retrofit2.h<T, RequestBody> f107968d;

        i(Method method, int i11, Headers headers, retrofit2.h<T, RequestBody> hVar) {
            this.f107965a = method;
            this.f107966b = i11;
            this.f107967c = headers;
            this.f107968d = hVar;
        }

        @Override // retrofit2.t
        void a(w wVar, T t11) {
            if (t11 == null) {
                return;
            }
            try {
                wVar.d(this.f107967c, this.f107968d.convert(t11));
            } catch (IOException e11) {
                throw d0.p(this.f107965a, this.f107966b, "Unable to convert " + t11 + " to RequestBody", e11);
            }
        }
    }

    static final class j<T> extends t<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f107969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f107970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final retrofit2.h<T, RequestBody> f107971c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f107972d;

        j(Method method, int i11, retrofit2.h<T, RequestBody> hVar, String str) {
            this.f107969a = method;
            this.f107970b = i11;
            this.f107971c = hVar;
            this.f107972d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, Map<String, T> map) {
            if (map == null) {
                throw d0.p(this.f107969a, this.f107970b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw d0.p(this.f107969a, this.f107970b, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw d0.p(this.f107969a, this.f107970b, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                wVar.d(Headers.of("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f107972d), this.f107971c.convert(value));
            }
        }
    }

    static final class k<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f107973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f107974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f107975c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final retrofit2.h<T, String> f107976d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f107977e;

        k(Method method, int i11, String str, retrofit2.h<T, String> hVar, boolean z11) {
            this.f107973a = method;
            this.f107974b = i11;
            Objects.requireNonNull(str, "name == null");
            this.f107975c = str;
            this.f107976d = hVar;
            this.f107977e = z11;
        }

        @Override // retrofit2.t
        void a(w wVar, T t11) throws EOFException {
            if (t11 != null) {
                wVar.f(this.f107975c, this.f107976d.convert(t11), this.f107977e);
                return;
            }
            throw d0.p(this.f107973a, this.f107974b, "Path parameter \"" + this.f107975c + "\" value must not be null.", new Object[0]);
        }
    }

    static final class l<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f107978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final retrofit2.h<T, String> f107979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f107980c;

        l(String str, retrofit2.h<T, String> hVar, boolean z11) {
            Objects.requireNonNull(str, "name == null");
            this.f107978a = str;
            this.f107979b = hVar;
            this.f107980c = z11;
        }

        @Override // retrofit2.t
        void a(w wVar, T t11) {
            String strConvert;
            if (t11 == null || (strConvert = this.f107979b.convert(t11)) == null) {
                return;
            }
            wVar.g(this.f107978a, strConvert, this.f107980c);
        }
    }

    static final class m<T> extends t<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f107981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f107982b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final retrofit2.h<T, String> f107983c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f107984d;

        m(Method method, int i11, retrofit2.h<T, String> hVar, boolean z11) {
            this.f107981a = method;
            this.f107982b = i11;
            this.f107983c = hVar;
            this.f107984d = z11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, Map<String, T> map) {
            if (map == null) {
                throw d0.p(this.f107981a, this.f107982b, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw d0.p(this.f107981a, this.f107982b, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw d0.p(this.f107981a, this.f107982b, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.f107983c.convert(value);
                if (strConvert == null) {
                    throw d0.p(this.f107981a, this.f107982b, "Query map value '" + value + "' converted to null by " + this.f107983c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                wVar.g(key, strConvert, this.f107984d);
            }
        }
    }

    static final class n<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final retrofit2.h<T, String> f107985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f107986b;

        n(retrofit2.h<T, String> hVar, boolean z11) {
            this.f107985a = hVar;
            this.f107986b = z11;
        }

        @Override // retrofit2.t
        void a(w wVar, T t11) {
            if (t11 == null) {
                return;
            }
            wVar.g(this.f107985a.convert(t11), null, this.f107986b);
        }
    }

    static final class o extends t<MultipartBody.Part> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final o f107987a = new o();

        private o() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, MultipartBody.Part part) {
            if (part != null) {
                wVar.e(part);
            }
        }
    }

    static final class p extends t<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f107988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f107989b;

        p(Method method, int i11) {
            this.f107988a = method;
            this.f107989b = i11;
        }

        @Override // retrofit2.t
        void a(w wVar, Object obj) {
            if (obj == null) {
                throw d0.p(this.f107988a, this.f107989b, "@Url parameter is null.", new Object[0]);
            }
            wVar.m(obj);
        }
    }

    static final class q<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class<T> f107990a;

        q(Class<T> cls) {
            this.f107990a = cls;
        }

        @Override // retrofit2.t
        void a(w wVar, T t11) {
            wVar.h(this.f107990a, t11);
        }
    }

    t() {
    }

    abstract void a(w wVar, T t11);

    final t<Object> b() {
        return new b();
    }

    final t<Iterable<T>> c() {
        return new a();
    }
}
