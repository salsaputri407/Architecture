package apps.example.architecturepractice.services;

import apps.example.architecturepractice.models.DogRandomResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface DogService {

    @GET("breads/image/random")
    Call<DogRandomResponse> fetchRandomDog();
}
