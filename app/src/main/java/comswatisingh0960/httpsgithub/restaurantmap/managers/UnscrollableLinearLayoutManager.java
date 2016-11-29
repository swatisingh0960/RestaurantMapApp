package comswatisingh0960.httpsgithub.restaurantmap.managers;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
/**
 * Created by Swati on 11/29/2016.
 */

public class UnscrollableLinearLayoutManager extends LinearLayoutManager {
    public UnscrollableLinearLayoutManager(Context context) {
        super(context);
    }

    @Override
    public boolean canScrollVertically() {
        return false;
    }
}
