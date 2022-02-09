public class BmiService {
    public float calculate(float weight, float heightCm) {
        float height = heightCm / 100;
        float IBM = weight / (height * height);
        return IBM;
    }
}
