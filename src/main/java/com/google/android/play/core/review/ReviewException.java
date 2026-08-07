package com.google.android.play.core.review;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import eu.a;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class ReviewException extends ApiException {
    public ReviewException(int i11) {
        super(new Status(i11, String.format(Locale.getDefault(), "Review Error(%d): %s", Integer.valueOf(i11), a.a(i11))));
    }
}
