package wd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Pair;
import ch.qos.logback.classic.net.SyslogAppender;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import co0.n;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import io.reactivex.rxjava3.core.u;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import jn0.x;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import td0.m;
import td0.r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b*\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0002¢\u0006\u0004\b\r\u0010\nJ!\u0010\u000e\u001a\u00020\b*\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u0013\u0010\u000f\u001a\u00020\b*\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00020\b*\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0004\b \u0010\u001fJ1\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b)\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lwd0/l;", "", "<init>", "()V", "Ljava/io/BufferedWriter;", "", "Ljava/io/File;", "logs", "Ljn0/h0;", "p", "(Ljava/io/BufferedWriter;Ljava/util/List;)V", "", "logLines", "o", "n", "m", "(Ljava/io/BufferedWriter;)V", "feedbackUnavailableVINs", "feedbackUnavailableDINs", "q", "(Ljava/io/BufferedWriter;Ljava/util/List;Ljava/util/List;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/net/Uri;", "uri", "subject", "chooserTitle", "mimeType", "l", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "g", "()Ljava/util/List;", "e", "line", "", "h", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Z", "Landroid/app/Activity;", "activity", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/app/Activity;)V", "k", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "logger", "report_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f121695a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("ShareReportUtil");

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements wn0.l<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f121697a = new a();

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof JSONObject);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T1, T2> implements cm0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f121698a;

        b(Activity activity) {
            this.f121698a = activity;
        }

        @Override // cm0.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Uri uri, Throwable th2) {
            if (uri != null) {
                l.f121695a.l(this.f121698a, uri, "Tesla App Logs", "Send Tesla App Logs", "application/zip");
                return;
            }
            if (th2 != null) {
                l.logger.f("Error zipping logs", th2);
                return;
            }
            com.tesla.logging.g gVar = l.logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("Error zipping logs");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d((String) ((Pair) t11).first, (String) ((Pair) t12).first);
        }
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(JSONObject jSONObject, String str) {
        return jSONObject.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri j(Activity activity) throws JSONException, IOException {
        File file = new File(activity.getCacheDir(), "zipped_logs");
        sn0.h.B(file);
        file.mkdirs();
        File file2 = new File(file, "logs-" + System.currentTimeMillis() + ".zip");
        file2.createNewFile();
        File file3 = new File(activity.getCacheDir(), "sorted-logs-" + System.currentTimeMillis() + ".txt");
        file3.createNewFile();
        List<File> listE = e.f121681a.e(activity);
        String strG = he0.b.m(activity).g();
        if (strG == null) {
            strG = "";
        }
        l lVar = f121695a;
        List<String> listG = lVar.g();
        List<String> listE2 = lVar.e();
        boolean zE = r.e();
        com.tesla.logging.g gVar = logger;
        gVar.a("Email: " + strG);
        gVar.a("Invalid VINs list: [" + v.y0(listG, null, null, null, 0, null, null, 63, null) + "]");
        gVar.a("Invalid DINs list: [" + v.y0(listE2, null, null, null, 0, null, null, 63, null) + "]");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            if (((File) obj).exists()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v.E(arrayList2, sn0.h.k((File) it.next(), null, 1, null));
        }
        List listY0 = v.Y0(arrayList2);
        ArrayList arrayList3 = new ArrayList(v.y(listY0, 10));
        Iterator it2 = listY0.iterator();
        while (it2.hasNext()) {
            arrayList3.add(cd0.a.c((String) it2.next(), strG, listG, listE2, zE));
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file3), p013kotlin.text.d.UTF_8), PKIFailureInfo.certRevoked);
        try {
            l lVar2 = f121695a;
            lVar2.p(bufferedWriter, listE);
            lVar2.n(bufferedWriter, arrayList3);
            lVar2.q(bufferedWriter, listG, listE2);
            lVar2.m(bufferedWriter);
            lVar2.o(bufferedWriter, arrayList3);
            sn0.b.a(bufferedWriter, null);
            ae0.b.f985a.a(v.e(Uri.fromFile(file3)), file2);
            file3.delete();
            return wd0.b.a(file2, activity);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(bufferedWriter, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(Context context, Uri uri, String subject, String chooserTitle, String mimeType) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(mimeType);
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.putExtra("android.intent.extra.SUBJECT", subject);
        context.startActivity(Intent.createChooser(intent, chooserTitle).setFlags(1));
    }

    private final void m(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.newLine();
        bufferedWriter.write("--- BUILD CONFIG ---");
        bufferedWriter.newLine();
        Iterator<T> it = do0.c.g(o0.b(wd0.a.class)).iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            bufferedWriter.write(nVar.getName() + ": " + nVar.get());
            bufferedWriter.newLine();
        }
    }

    private final void n(BufferedWriter bufferedWriter, List<String> list) throws IOException {
        bufferedWriter.newLine();
        bufferedWriter.write("--- ERRORS ---");
        bufferedWriter.newLine();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (t.h0((String) obj, "[E]", false, 2, null)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(t.V((String) it.next(), SyslogAppender.DEFAULT_STACKTRACE_PATTERN, "\n", false, 4, null));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            bufferedWriter.write((String) it2.next());
            bufferedWriter.newLine();
        }
    }

    private final void o(BufferedWriter bufferedWriter, List<String> list) throws IOException {
        bufferedWriter.newLine();
        bufferedWriter.write("--- LOGS ---");
        bufferedWriter.newLine();
        for (String str : list) {
            if (t.h0(str, "OwnerAPI", false, 2, null) && t.h0(str, "\"response\"", false, 2, null)) {
                try {
                    int iV0 = t.v0(str, "{\"response", 0, false, 6, null);
                    int i11 = -1;
                    int length = str.length() - 1;
                    if (length >= 0) {
                        while (true) {
                            int i12 = length - 1;
                            if (str.charAt(length) == '}') {
                                i11 = length;
                                break;
                            } else if (i12 < 0) {
                                break;
                            } else {
                                length = i12;
                            }
                        }
                    }
                    int i13 = i11 + 1;
                    String strSubstring = str.substring(iV0, i13);
                    s.j(strSubstring, "substring(...)");
                    String string = new JSONObject(strSubstring).toString(2);
                    StringBuilder sb2 = new StringBuilder();
                    String strSubstring2 = str.substring(0, iV0);
                    s.j(strSubstring2, "substring(...)");
                    sb2.append(strSubstring2);
                    sb2.append(string);
                    String strSubstring3 = str.substring(i13);
                    s.j(strSubstring3, "substring(...)");
                    sb2.append(strSubstring3);
                    bufferedWriter.write(sb2.toString());
                } catch (Exception unused) {
                    bufferedWriter.write(str);
                }
            } else {
                bufferedWriter.write(str);
            }
            bufferedWriter.newLine();
        }
    }

    private final void p(BufferedWriter bufferedWriter, List<? extends File> list) throws IOException {
        bufferedWriter.newLine();
        bufferedWriter.write("--- LOGS METADATA ---");
        bufferedWriter.newLine();
        for (File file : list) {
            String message = null;
            try {
                sn0.h.n(file, null, 1, null);
            } catch (Exception e11) {
                message = e11.getMessage();
            }
            String name = file.getName();
            boolean zCanRead = file.canRead();
            boolean zExists = file.exists();
            boolean zIsFile = file.isFile();
            if (message == null) {
                message = "none";
            }
            bufferedWriter.write("name: " + name + " canRead: " + zCanRead + " exists: " + zExists + " isFile: " + zIsFile + " readError: " + message + " lastModified: " + file.lastModified());
            bufferedWriter.newLine();
        }
    }

    private final void q(BufferedWriter bufferedWriter, List<String> list, List<String> list2) throws IOException {
        bufferedWriter.newLine();
        bufferedWriter.write("--- REALM ---");
        bufferedWriter.newLine();
        List<Pair<String, String>> listK = m.j().k();
        s.j(listK, "getKeyValues(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            Object first = ((Pair) obj).first;
            s.j(first, "first");
            if (!t.f0((CharSequence) first, "PRIVATE", true)) {
                arrayList.add(obj);
            }
        }
        for (Pair pair : v.a1(arrayList, new c())) {
            String str = (String) pair.first;
            String string = (String) pair.second;
            try {
                if (!d1.c("persist:appSettings").contains(str)) {
                    string = new JSONObject(string).toString(2);
                }
            } catch (Exception unused) {
            }
            String str2 = str + ": " + string;
            if (f121695a.h(str2, list, list2)) {
                bufferedWriter.write(str2);
                bufferedWriter.newLine();
            }
        }
    }

    public final List<String> e() {
        r rVar = r.f113232a;
        JSONObject jSONObjectA = rVar.a();
        List<String> listF = rVar.f(String.valueOf(jSONObjectA != null ? jSONObjectA.get("feedbackEnergyProductIds") : null));
        if (listF == null) {
            listF = v.m();
        }
        JSONObject jSONObjectB = rVar.b();
        ArrayList arrayList = new ArrayList();
        if (jSONObjectB == null) {
            logger.j("feedbackUnavailableDINs energySites is null");
            return arrayList;
        }
        final JSONObject jSONObjectG = rVar.g(jSONObjectB.get("byId").toString());
        if (jSONObjectG == null) {
            logger.j("feedbackUnavailableDINs energySites.byId is null");
            return arrayList;
        }
        Iterator<String> itKeys = jSONObjectG.keys();
        s.j(itKeys, "keys(...)");
        ho0.i iVarH = ho0.l.H(ho0.l.U(ho0.l.h(itKeys), new wn0.l() { // from class: wd0.k
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return l.f(jSONObjectG, (String) obj);
            }
        }), a.f121697a);
        s.i(iVarH, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        Iterator it = ho0.l.c0(iVarH).iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectG2 = r.f113232a.g(((JSONObject) it.next()).get("summary").toString());
            if (jSONObjectG2 != null) {
                String string = jSONObjectG2.get("asset_site_id").toString();
                Object objOpt = jSONObjectG2.opt("gateway_id");
                if (objOpt != null) {
                    String string2 = objOpt.toString();
                    if (string2.length() > 0 && string.length() > 0 && !listF.contains(string)) {
                        arrayList.add(string2);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<String> g() {
        Set setD;
        String strOptString;
        r rVar = r.f113232a;
        JSONObject jSONObjectA = rVar.a();
        List<String> listF = rVar.f(String.valueOf(jSONObjectA != null ? jSONObjectA.get("feedbackVehicleVINs") : null));
        if (listF == null || (setD = v.r1(listF)) == null) {
            setD = d1.d();
        }
        List<Pair<String, String>> listK = m.j().k();
        s.j(listK, "getKeyValues(...)");
        ArrayList<Pair> arrayList = new ArrayList();
        for (Object obj : listK) {
            Object first = ((Pair) obj).first;
            s.j(first, "first");
            if (t.b0((String) first, "V_", false, 2, null)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            try {
                strOptString = new JSONObject((String) pair.second).optString("vin");
                s.h(strOptString);
                if (strOptString.length() <= 0) {
                    strOptString = null;
                }
            } catch (Exception e11) {
                logger.n("Failed to parse vehicle JSON for key: " + pair.first + ": " + e11);
            }
            if (strOptString != null) {
                arrayList2.add(strOptString);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!setD.contains((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        return v.p1(arrayList3);
    }

    public final boolean h(String line, List<String> feedbackUnavailableVINs, List<String> feedbackUnavailableDINs) {
        boolean z11;
        boolean z12;
        s.k(line, "line");
        s.k(feedbackUnavailableVINs, "feedbackUnavailableVINs");
        s.k(feedbackUnavailableDINs, "feedbackUnavailableDINs");
        List<String> list = feedbackUnavailableVINs;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = true;
                    break;
                }
                if (t.h0(line, t.U1((String) it.next(), 6), false, 2, null)) {
                    z11 = false;
                    break;
                }
            }
        } else {
            z11 = true;
            break;
        }
        List<String> list2 = feedbackUnavailableDINs;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z12 = true;
                    break;
                }
                if (t.h0(line, (String) it2.next(), false, 2, null)) {
                    z12 = false;
                    break;
                }
            }
        } else {
            z12 = true;
            break;
        }
        return z11 && z12;
    }

    public final void i(final Activity activity) {
        s.k(activity, "activity");
        u.k(new Callable() { // from class: wd0.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return l.j(activity);
            }
        }).v(vm0.a.c()).s(new b(activity));
    }

    public final void k(Activity activity) {
        s.k(activity, "activity");
        File fileD = e.f121681a.d(activity);
        if (fileD == null) {
            logger.j("No zipped report found to share");
            return;
        }
        Uri uriA = wd0.b.a(fileD, activity);
        l(activity, uriA, "Feedback Report: " + uriA.getLastPathSegment(), "Send Zipped Feedback Report Files", "application/zip");
    }
}
