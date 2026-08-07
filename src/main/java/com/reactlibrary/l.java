package com.reactlibrary;

import android.content.Context;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class l {
    public static PaymentsClient a(int i11, Context context) {
        return Wallet.getPaymentsClient(context, new Wallet.WalletOptions.Builder().setEnvironment(i11).build());
    }

    private static JSONArray b() {
        return new JSONArray().put("PAN_ONLY").put("CRYPTOGRAM_3DS");
    }

    private static JSONArray c() {
        return new JSONArray().put("AMEX").put("DISCOVER").put("MASTERCARD").put("VISA");
    }

    private static JSONArray d(Map<String, Object> map, List<Object> list) {
        return new JSONArray().put(g(map, list));
    }

    private static JSONObject e(List<Object> list) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("type", "CARD").put("parameters", new JSONObject().put("allowedAuthMethods", b()).put("allowedCardNetworks", c()));
        if (list == null || list.isEmpty() || !(list.contains("requireBillingFieldFull") || list.contains("requireBillingFieldMin"))) {
            return jSONObjectPut;
        }
        jSONObjectPut.getJSONObject("parameters").put("billingAddressRequired", true).put("billingAddressParameters", new JSONObject().put("format", list.contains("requireBillingFieldFull") ? "FULL" : "MIN"));
        return jSONObjectPut;
    }

    private static JSONObject f() {
        return new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
    }

    private static JSONObject g(Map<String, Object> map, List<Object> list) {
        return e(list).put("tokenizationSpecification", h(map));
    }

    private static JSONObject h(Map<String, Object> map) {
        return new JSONObject().put("type", "PAYMENT_GATEWAY").put("parameters", new JSONObject().put("gateway", "adyen").put("gatewayMerchantId", String.valueOf(map.get("merchantId"))));
    }

    public static JSONObject i(List<Object> list) {
        try {
            return f().put("allowedPaymentMethods", new JSONArray().put(e(list)));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static JSONObject j(Map<String, Object> map, List<Object> list) {
        try {
            return f().put("allowedPaymentMethods", d(map, list)).put("transactionInfo", k(map));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static JSONObject k(Map<String, Object> map) {
        String strValueOf = String.valueOf(map.get("price"));
        String strValueOf2 = String.valueOf(map.get("countryCode"));
        return new JSONObject().put("totalPrice", strValueOf).put("totalPriceStatus", "FINAL").put("countryCode", strValueOf2).put("currencyCode", String.valueOf(map.get("currencyCode"))).put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
    }
}
