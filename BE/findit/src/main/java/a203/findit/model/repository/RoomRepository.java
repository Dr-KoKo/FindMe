package a203.findit.model.repository;

import a203.findit.model.dto.req.User.RoomDTO;
import a203.findit.model.entity.Game;
import a203.findit.model.entity.Mode;

public interface RoomRepository {
    public RoomDTO save(String entercode, Game game, Mode mode);
}
