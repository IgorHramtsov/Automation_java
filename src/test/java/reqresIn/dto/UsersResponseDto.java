package reqresIn.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UsersResponseDto {

    private int page;

    @JsonProperty("per_page")
    private int perPage;

    private int total;

    @JsonProperty("total_pages")
    private int totalPages;

    private List<UserDto> data;

    // support и _meta нам для теста обычно не нужны, поэтому игнорируем через @JsonIgnoreProperties

    public int getPage() {
        return page; }
    public int getPerPage() {
        return perPage; }
    public int getTotal() {
        return total; }
    public int getTotalPages() {
        return totalPages; }
    public List<UserDto> getData() {
        return data; }
}
