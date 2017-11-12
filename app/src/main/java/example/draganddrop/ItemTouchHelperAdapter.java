package example.draganddrop;

/**
 * Created by Boris on 12-Nov-17.
 */

public interface ItemTouchHelperAdapter {

    boolean onItemMove(int fromPosition, int toPosition);

    void onItemDismiss(int position);
}