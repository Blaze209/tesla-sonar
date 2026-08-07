package community.revteltech.nfc;

import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.MifareClassic;
import android.nfc.tech.MifareUltralight;
import android.nfc.tech.Ndef;
import android.nfc.tech.NdefFormatable;
import android.nfc.tech.NfcA;
import android.nfc.tech.NfcB;
import android.nfc.tech.NfcF;
import android.nfc.tech.NfcV;
import android.nfc.tech.TagTechnology;
import android.util.Log;
import com.facebook.react.bridge.Callback;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static String f58892f = "NfcManager-tech";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Tag f58893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    TagTechnology f58894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f58895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<Object> f58896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Callback f58897e;

    d(ArrayList<Object> arrayList, Callback callback) {
        this.f58896d = arrayList;
        this.f58897e = callback;
    }

    void a() {
        try {
            this.f58894b.close();
        } catch (Exception unused) {
            Log.d(f58892f, "fail to close tech");
        }
    }

    boolean b(Tag tag) {
        if (tag == null) {
            Log.d(f58892f, "received null tag at connect()");
            return false;
        }
        this.f58893a = tag;
        for (int i11 = 0; i11 < this.f58896d.size(); i11++) {
            String str = (String) this.f58896d.get(i11);
            str.getClass();
            switch (str) {
                case "IsoDep":
                    this.f58894b = IsoDep.get(tag);
                    break;
                case "NdefFormatable":
                    this.f58894b = NdefFormatable.get(tag);
                    break;
                case "Ndef":
                    this.f58894b = Ndef.get(tag);
                    break;
                case "NfcA":
                    this.f58894b = NfcA.get(tag);
                    break;
                case "NfcB":
                    this.f58894b = NfcB.get(tag);
                    break;
                case "NfcF":
                    this.f58894b = NfcF.get(tag);
                    break;
                case "NfcV":
                    this.f58894b = NfcV.get(tag);
                    break;
                case "MifareUltralight":
                    this.f58894b = MifareUltralight.get(tag);
                    break;
                case "MifareClassic":
                    this.f58894b = MifareClassic.get(tag);
                    break;
            }
            if (this.f58894b != null) {
                try {
                    Log.d(f58892f, "connect to " + str);
                    this.f58894b.connect();
                    this.f58895c = str;
                    return true;
                } catch (Exception unused) {
                    Log.d(f58892f, "fail to connect tech");
                }
            }
        }
        this.f58894b = null;
        this.f58895c = null;
        return false;
    }

    Tag c() {
        return this.f58893a;
    }

    TagTechnology d() {
        return this.f58894b;
    }

    String e() {
        return this.f58895c;
    }

    void f(String str) {
        Callback callback = this.f58897e;
        if (callback != null) {
            callback.invoke(null, str);
            this.f58897e = null;
        }
    }

    void g(String str) {
        Callback callback = this.f58897e;
        if (callback != null) {
            callback.invoke(str);
            this.f58897e = null;
        }
    }

    boolean h() {
        return this.f58894b != null;
    }
}
