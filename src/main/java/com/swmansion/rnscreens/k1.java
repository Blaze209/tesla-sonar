package com.swmansion.rnscreens;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\nJ\u001d\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0005R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001c\u0010(\u001a\n %*\u0004\u0018\u00010$0$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001c\u0010,\u001a\n %*\u0004\u0018\u00010)0)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001c\u0010.\u001a\n %*\u0004\u0018\u00010)0)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+¨\u0006/"}, d2 = {"Lcom/swmansion/rnscreens/k1;", "", "Landroidx/appcompat/widget/SearchView;", "searchView", "<init>", "(Landroidx/appcompat/widget/SearchView;)V", "", "textColor", "Ljn0/h0;", "setTextColor", "(Ljava/lang/Integer;)V", "tintColor", "setTintColor", "headerIconColor", "setHeaderIconColor", "hintTextColor", "setHintTextColor", "", "placeholder", "", "shouldShowHintSearchIcon", "setPlaceholder", "(Ljava/lang/String;Z)V", "Landroidx/appcompat/widget/SearchView;", "getSearchView", "()Landroidx/appcompat/widget/SearchView;", "setSearchView", "defaultTextColor", "Ljava/lang/Integer;", "Landroid/graphics/drawable/Drawable;", "defaultTintBackground", "Landroid/graphics/drawable/Drawable;", "Landroid/widget/EditText;", "getSearchEditText", "()Landroid/widget/EditText;", "searchEditText", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getSearchTextPlate", "()Landroid/view/View;", "searchTextPlate", "Landroid/widget/ImageView;", "getSearchIcon", "()Landroid/widget/ImageView;", "searchIcon", "getSearchCloseIcon", "searchCloseIcon", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k1 {
    private Integer defaultTextColor;
    private Drawable defaultTintBackground;
    private SearchView searchView;

    public k1(SearchView searchView) {
        p013kotlin.jvm.internal.s.k(searchView, "searchView");
        this.searchView = searchView;
    }

    private final ImageView getSearchCloseIcon() {
        return (ImageView) this.searchView.findViewById(i.f.f73825z);
    }

    private final EditText getSearchEditText() {
        View viewFindViewById = this.searchView.findViewById(i.f.E);
        if (viewFindViewById instanceof EditText) {
            return (EditText) viewFindViewById;
        }
        return null;
    }

    private final ImageView getSearchIcon() {
        return (ImageView) this.searchView.findViewById(i.f.f73824y);
    }

    private final View getSearchTextPlate() {
        return this.searchView.findViewById(i.f.D);
    }

    public final SearchView getSearchView() {
        return this.searchView;
    }

    public final void setHeaderIconColor(Integer headerIconColor) {
        if (headerIconColor != null) {
            int iIntValue = headerIconColor.intValue();
            getSearchIcon().setColorFilter(iIntValue);
            getSearchCloseIcon().setColorFilter(iIntValue);
        }
    }

    public final void setHintTextColor(Integer hintTextColor) {
        if (hintTextColor != null) {
            int iIntValue = hintTextColor.intValue();
            EditText searchEditText = getSearchEditText();
            if (searchEditText != null) {
                searchEditText.setHintTextColor(iIntValue);
            }
        }
    }

    public final void setPlaceholder(String placeholder, boolean shouldShowHintSearchIcon) {
        p013kotlin.jvm.internal.s.k(placeholder, "placeholder");
        if (shouldShowHintSearchIcon) {
            this.searchView.setQueryHint(placeholder);
            return;
        }
        EditText searchEditText = getSearchEditText();
        if (searchEditText != null) {
            searchEditText.setHint(placeholder);
        }
    }

    public final void setSearchView(SearchView searchView) {
        p013kotlin.jvm.internal.s.k(searchView, "<set-?>");
        this.searchView = searchView;
    }

    public final void setTextColor(Integer textColor) {
        EditText searchEditText;
        ColorStateList textColors;
        Integer num = this.defaultTextColor;
        if (textColor == null) {
            if (num == null || (searchEditText = getSearchEditText()) == null) {
                return;
            }
            searchEditText.setTextColor(num.intValue());
            return;
        }
        if (num == null) {
            EditText searchEditText2 = getSearchEditText();
            this.defaultTextColor = (searchEditText2 == null || (textColors = searchEditText2.getTextColors()) == null) ? null : Integer.valueOf(textColors.getDefaultColor());
        }
        EditText searchEditText3 = getSearchEditText();
        if (searchEditText3 != null) {
            searchEditText3.setTextColor(textColor.intValue());
        }
    }

    public final void setTintColor(Integer tintColor) {
        Drawable drawable = this.defaultTintBackground;
        if (tintColor != null) {
            if (drawable == null) {
                this.defaultTintBackground = getSearchTextPlate().getBackground();
            }
            getSearchTextPlate().setBackgroundColor(tintColor.intValue());
        } else if (drawable != null) {
            getSearchTextPlate().setBackground(drawable);
        }
    }
}
