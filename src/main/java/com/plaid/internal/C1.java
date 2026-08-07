package com.plaid.internal;

import android.content.Intent;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class C1 {
    public static final AbstractC4587y6 a(Intent intent) {
        if (intent == null) {
            return null;
        }
        if (intent.getBooleanExtra("redirect_error", false)) {
            Serializable serializableExtra = intent.getSerializableExtra("redirect_error_exception");
            return new AbstractC4587y6.d(serializableExtra != null ? (Exception) serializableExtra : new RuntimeException("Unknown oauth redirect exception"));
        }
        if (!intent.hasExtra("link_oauth_redirect") && !intent.hasExtra("link_out_of_process_complete_redirect") && !intent.hasExtra("link_out_of_process_closed_redirect_uri") && !intent.hasExtra("link_resume_redirect")) {
            return null;
        }
        if (intent.hasExtra("link_out_of_process_closed_redirect_uri")) {
            return new AbstractC4587y6.c();
        }
        if (intent.hasExtra("link_resume_redirect")) {
            return new AbstractC4587y6.e();
        }
        String stringExtra = intent.getStringExtra("link_oauth_received_redirect_uri");
        if (stringExtra != null) {
            return new AbstractC4587y6.a(stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("link_out_of_process_complete_redirect_uri");
        return stringExtra2 != null ? new AbstractC4587y6.b(stringExtra2) : new AbstractC4587y6.d(new RuntimeException("Redirect uri cannot be null"));
    }
}
