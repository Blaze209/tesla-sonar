package hv;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import gv.f0;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final rv.a f73658a = new tv.d().i(gv.a.f69575a).j(true).h();

    /* JADX INFO: Access modifiers changed from: private */
    interface a<T> {
        T a(@NonNull JsonReader jsonReader);
    }

    @NonNull
    private static f0.e.d.f A(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.d.f.a aVarA = f0.e.d.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("assignments")) {
                aVarA.b(n(jsonReader, new a() { // from class: hv.f
                    @Override // hv.j.a
                    public final Object a(JsonReader jsonReader2) {
                        return j.z(jsonReader2);
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    @NonNull
    private static f0.e.d.a.b.AbstractC1432d B(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.d.a.b.AbstractC1432d.AbstractC1433a abstractC1433aA = f0.e.d.a.b.AbstractC1432d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "address":
                    abstractC1433aA.b(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC1433aA.c(jsonReader.nextString());
                    break;
                case "name":
                    abstractC1433aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1433aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static f0.e.d.a.b.AbstractC1434e C(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.d.a.b.AbstractC1434e.AbstractC1435a abstractC1435aA = f0.e.d.a.b.AbstractC1434e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC1435aA.b(n(jsonReader, new i()));
                    break;
                case "name":
                    abstractC1435aA.d(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC1435aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1435aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static f0.d.b D(@NonNull JsonReader jsonReader) throws IOException {
        f0.d.b.a aVarA = f0.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("filename")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                aVarA.b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    @NonNull
    private static f0.d E(@NonNull JsonReader jsonReader) throws IOException {
        f0.d.a aVarA = f0.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("files")) {
                aVarA.b(n(jsonReader, new a() { // from class: hv.e
                    @Override // hv.j.a
                    public final Object a(JsonReader jsonReader2) {
                        return j.D(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    @NonNull
    private static f0.e.AbstractC1441e F(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.AbstractC1441e.a aVarA = f0.e.AbstractC1441e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildVersion":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "jailbroken":
                    aVarA.c(jsonReader.nextBoolean());
                    break;
                case "version":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "platform":
                    aVarA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static f0.e.d.a.c G(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.d.a.c.AbstractC1438a abstractC1438aA = f0.e.d.a.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    abstractC1438aA.d(jsonReader.nextInt());
                    break;
                case "processName":
                    abstractC1438aA.e(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    abstractC1438aA.b(jsonReader.nextBoolean());
                    break;
                case "importance":
                    abstractC1438aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1438aA.a();
    }

    @NonNull
    private static f0 H(@NonNull JsonReader jsonReader) throws IOException {
        f0.b bVarB = f0.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    bVarB.j(E(jsonReader));
                    break;
                case "sdkVersion":
                    bVarB.l(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    bVarB.c(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    bVarB.b(m(jsonReader));
                    break;
                case "buildVersion":
                    bVarB.d(jsonReader.nextString());
                    break;
                case "firebaseAuthenticationToken":
                    bVarB.f(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    bVarB.h(jsonReader.nextString());
                    break;
                case "installationUuid":
                    bVarB.i(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    bVarB.g(jsonReader.nextString());
                    break;
                case "platform":
                    bVarB.k(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    bVarB.e(jsonReader.nextString());
                    break;
                case "session":
                    bVarB.m(J(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarB.a();
    }

    @NonNull
    private static f0.e.d.AbstractC1440e.b I(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.d.AbstractC1440e.b.a aVarA = f0.e.d.AbstractC1440e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("variantId")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("rolloutId")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    @NonNull
    private static f0.e J(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.b bVarA = f0.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "startedAt":
                    bVarA.m(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    bVarA.c(jsonReader.nextString());
                    break;
                case "identifier":
                    bVarA.k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    bVarA.f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    bVarA.e(q(jsonReader));
                    break;
                case "events":
                    bVarA.g(n(jsonReader, new a() { // from class: hv.d
                        @Override // hv.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.r(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    bVarA.l(F(jsonReader));
                    break;
                case "app":
                    bVarA.b(l(jsonReader));
                    break;
                case "user":
                    bVarA.n(K(jsonReader));
                    break;
                case "generator":
                    bVarA.h(jsonReader.nextString());
                    break;
                case "crashed":
                    bVarA.d(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    bVarA.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    @NonNull
    private static f0.e.f K(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.f.a aVarA = f0.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    @NonNull
    private static f0.e.a l(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.a.AbstractC1426a abstractC1426aA = f0.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "identifier":
                    abstractC1426aA.e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC1426aA.b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC1426aA.c(jsonReader.nextString());
                    break;
                case "version":
                    abstractC1426aA.g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC1426aA.f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC1426aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1426aA.a();
    }

    @NonNull
    private static f0.a m(@NonNull JsonReader jsonReader) throws IOException {
        f0.a.b bVarA = f0.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    bVarA.b(n(jsonReader, new a() { // from class: hv.a
                        @Override // hv.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.o(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    bVarA.d(jsonReader.nextInt());
                    break;
                case "pss":
                    bVarA.f(jsonReader.nextLong());
                    break;
                case "rss":
                    bVarA.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    bVarA.i(jsonReader.nextLong());
                    break;
                case "processName":
                    bVarA.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    bVarA.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    bVarA.j(jsonReader.nextString());
                    break;
                case "importance":
                    bVarA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    @NonNull
    private static <T> List<T> n(@NonNull JsonReader jsonReader, @NonNull a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static f0.a.AbstractC1424a o(@NonNull JsonReader jsonReader) throws IOException {
        f0.a.AbstractC1424a.AbstractC1425a abstractC1425aA = f0.a.AbstractC1424a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    abstractC1425aA.d(jsonReader.nextString());
                    break;
                case "arch":
                    abstractC1425aA.b(jsonReader.nextString());
                    break;
                case "buildId":
                    abstractC1425aA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1425aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static f0.c p(@NonNull JsonReader jsonReader) throws IOException {
        f0.c.a aVarA = f0.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals(Action.KEY_ATTRIBUTE)) {
                aVarA.b(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    @NonNull
    private static f0.e.c q(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.c.a aVarA = f0.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "simulator":
                    aVarA.i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "ram":
                    aVarA.h(jsonReader.nextLong());
                    break;
                case "arch":
                    aVarA.b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "cores":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "model":
                    aVarA.f(jsonReader.nextString());
                    break;
                case "state":
                    aVarA.j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    aVarA.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static f0.e.d r(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.d.b bVarA = f0.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    bVarA.c(u(jsonReader));
                    break;
                case "rollouts":
                    bVarA.e(A(jsonReader));
                    break;
                case "app":
                    bVarA.b(s(jsonReader));
                    break;
                case "log":
                    bVarA.d(y(jsonReader));
                    break;
                case "type":
                    bVarA.g(jsonReader.nextString());
                    break;
                case "timestamp":
                    bVarA.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    @NonNull
    private static f0.e.d.a s(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.d.a.AbstractC1427a abstractC1427aA = f0.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appProcessDetails":
                    abstractC1427aA.b(n(jsonReader, new a() { // from class: hv.c
                        @Override // hv.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.G(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    abstractC1427aA.c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC1427aA.f(v(jsonReader));
                    break;
                case "internalKeys":
                    abstractC1427aA.g(n(jsonReader, new a() { // from class: hv.b
                        @Override // hv.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.p(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    abstractC1427aA.e(n(jsonReader, new a() { // from class: hv.b
                        @Override // hv.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.p(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC1427aA.h(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    abstractC1427aA.d(G(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1427aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static f0.e.d.a.b.AbstractC1428a t(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.d.a.b.AbstractC1428a.AbstractC1429a abstractC1429aA = f0.e.d.a.b.AbstractC1428a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    abstractC1429aA.c(jsonReader.nextString());
                    break;
                case "size":
                    abstractC1429aA.d(jsonReader.nextLong());
                    break;
                case "uuid":
                    abstractC1429aA.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    abstractC1429aA.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1429aA.a();
    }

    @NonNull
    private static f0.e.d.c u(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.d.c.a aVarA = f0.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "batteryLevel":
                    aVarA.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "orientation":
                    aVarA.e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    aVarA.g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    aVarA.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    @NonNull
    private static f0.e.d.a.b v(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.d.a.b.AbstractC1430b abstractC1430bA = f0.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appExitInfo":
                    abstractC1430bA.b(m(jsonReader));
                    break;
                case "threads":
                    abstractC1430bA.f(n(jsonReader, new a() { // from class: hv.g
                        @Override // hv.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.C(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC1430bA.e(B(jsonReader));
                    break;
                case "binaries":
                    abstractC1430bA.c(n(jsonReader, new a() { // from class: hv.h
                        @Override // hv.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.t(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    abstractC1430bA.d(w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1430bA.a();
    }

    @NonNull
    private static f0.e.d.a.b.c w(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.d.a.b.c.AbstractC1431a abstractC1431aA = f0.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC1431aA.c(n(jsonReader, new i()));
                    break;
                case "reason":
                    abstractC1431aA.e(jsonReader.nextString());
                    break;
                case "type":
                    abstractC1431aA.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC1431aA.b(w(jsonReader));
                    break;
                case "overflowCount":
                    abstractC1431aA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1431aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static f0.e.d.a.b.AbstractC1434e.AbstractC1436b x(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.d.a.b.AbstractC1434e.AbstractC1436b.AbstractC1437a abstractC1437aA = f0.e.d.a.b.AbstractC1434e.AbstractC1436b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    abstractC1437aA.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC1437aA.f(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC1437aA.e(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC1437aA.b(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC1437aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1437aA.a();
    }

    @NonNull
    private static f0.e.d.AbstractC1439d y(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.d.AbstractC1439d.a aVarA = f0.e.d.AbstractC1439d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static f0.e.d.AbstractC1440e z(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.d.AbstractC1440e.a aVarA = f0.e.d.AbstractC1440e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parameterKey":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "templateVersion":
                    aVarA.e(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    aVarA.d(I(jsonReader));
                    break;
                case "parameterValue":
                    aVarA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    @NonNull
    public f0 L(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                f0 f0VarH = H(jsonReader);
                jsonReader.close();
                return f0VarH;
            } catch (Throwable th2) {
                try {
                    jsonReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalStateException e11) {
            throw new IOException(e11);
        }
    }

    @NonNull
    public String M(@NonNull f0 f0Var) {
        return f73658a.encode(f0Var);
    }

    @NonNull
    public f0.e.d j(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                f0.e.d dVarR = r(jsonReader);
                jsonReader.close();
                return dVarR;
            } catch (Throwable th2) {
                try {
                    jsonReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalStateException e11) {
            throw new IOException(e11);
        }
    }

    @NonNull
    public String k(@NonNull f0.e.d dVar) {
        return f73658a.encode(dVar);
    }
}
