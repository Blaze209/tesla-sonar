package community.revteltech.nfc;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.util.Log;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final char[] f58898a = "0123456789ABCDEF".toCharArray();

    static JSONArray a(byte[] bArr) {
        JSONArray jSONArray = new JSONArray();
        for (byte b11 : bArr) {
            jSONArray.put(b11 & 255);
        }
        return jSONArray;
    }

    public static String b(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b11 = bArr[i11];
            int i12 = i11 * 2;
            char[] cArr2 = f58898a;
            cArr[i12] = cArr2[(b11 & 255) >>> 4];
            cArr[i12 + 1] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    static JSONArray c(NdefMessage ndefMessage) {
        if (ndefMessage == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (NdefRecord ndefRecord : ndefMessage.getRecords()) {
            arrayList.add(e(ndefRecord));
        }
        return new JSONArray((Collection) arrayList);
    }

    static JSONObject d(Ndef ndef) {
        JSONObject jSONObject = new JSONObject();
        if (ndef != null) {
            try {
                Tag tag = ndef.getTag();
                if (tag != null) {
                    jSONObject.put("id", b(tag.getId()));
                    jSONObject.put("techTypes", new JSONArray((Collection) Arrays.asList(tag.getTechList())));
                }
                jSONObject.put("type", g(ndef.getType()));
                jSONObject.put("maxSize", ndef.getMaxSize());
                jSONObject.put("isWritable", ndef.isWritable());
                jSONObject.put("ndefMessage", c(ndef.getCachedNdefMessage()));
                try {
                    try {
                        jSONObject.put("canMakeReadOnly", ndef.canMakeReadOnly());
                    } catch (SecurityException e11) {
                        Log.e("NfcPlugin", "Failed due to out of date tag", e11);
                        jSONObject.put("canMakeReadOnly", JSONObject.NULL);
                    }
                } catch (NullPointerException unused) {
                    jSONObject.put("canMakeReadOnly", JSONObject.NULL);
                }
            } catch (JSONException e12) {
                Log.e("NfcPlugin", "Failed to convert ndef into json: " + ndef, e12);
            }
        }
        return jSONObject;
    }

    static JSONObject e(NdefRecord ndefRecord) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tnf", (int) ndefRecord.getTnf());
            jSONObject.put("type", a(ndefRecord.getType()));
            jSONObject.put("id", b(ndefRecord.getId()));
            jSONObject.put(StatusResponse.PAYLOAD, a(ndefRecord.getPayload()));
            return jSONObject;
        } catch (JSONException e11) {
            Log.e("NfcPlugin", "Failed to convert ndef record into json: " + ndefRecord, e11);
            return jSONObject;
        }
    }

    static JSONObject f(Tag tag) {
        JSONObject jSONObject = new JSONObject();
        if (tag != null) {
            try {
                jSONObject.put("id", b(tag.getId()));
                jSONObject.put("techTypes", new JSONArray((Collection) Arrays.asList(tag.getTechList())));
                return jSONObject;
            } catch (JSONException e11) {
                Log.e("NfcPlugin", "Failed to convert tag into json: " + tag, e11);
            }
        }
        return jSONObject;
    }

    static String g(String str) {
        str.getClass();
        switch (str) {
            case "org.nfcforum.ndef.type1":
                return "NFC Forum Type 1";
            case "org.nfcforum.ndef.type2":
                return "NFC Forum Type 2";
            case "org.nfcforum.ndef.type3":
                return "NFC Forum Type 3";
            case "org.nfcforum.ndef.type4":
                return "NFC Forum Type 4";
            default:
                return str;
        }
    }
}
